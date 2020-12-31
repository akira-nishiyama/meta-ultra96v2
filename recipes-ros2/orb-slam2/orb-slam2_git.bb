# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.txt
#   orb_slam2/Thirdparty/DBoW2/LICENSE.txt
#   orb_slam2/Thirdparty/g2o/license-bsd.txt
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "GPLv3 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://License-gpl.txt;md5=d32239bcb673463ab874e80d47fae504 \
                    file://LICENSE.txt;md5=9f7421fb91aef33332dbdfab7e243c01 \
                    file://orb_slam2/Thirdparty/DBoW2/LICENSE.txt;md5=b91b90de616800c44c9ebba46c143a70 \
                    file://orb_slam2/Thirdparty/g2o/license-bsd.txt;md5=9c0c0561478261cb090e64115139d923"

SRC_URI = "git://github.com/appliedAI-Initiative/orb_slam_2_ros.git;protocol=https;branch=ros2"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "0f964c618a2e0b7715c1c6fc49e6b70b2ba2c904"

S = "${WORKDIR}/git"

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = ""
AUTHOR = "Raul Mur-Artal, Juan D. Tardos, J. M. M. Montiel and Dorian Galvez-Lopez (DBoW2)."
ROS_AUTHOR = ""
HOMEPAGE = ""
SECTION = "devel"

ROS_CN = "orb-slam2"
ROS_BPN = "orb-slam2"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    std-msgs \
    geometry-msgs \
    tf2-geometry-msgs \
    cv-bridge \
    image-common \
    image-transport \
    tf2-ros \
    sensor-msgs \
    rosidl-default-generators \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cairo \
    ceres-solver \
    gflags \
    glog \
    libeigen \
    lua \
    protobuf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    std-msgs \
    geometry-msgs \
    cv-bridge \
    image-transport \
    tf2-ros \
    sensor-msgs \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

FILES_${PN} += "*"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
