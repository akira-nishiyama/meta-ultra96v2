# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD;md5=3775480a712fc46a69647678acb234cb"

SRC_URI = "git://github.com/clydemcqueen/opencv_cam.git;protocol=https;branch=eloquent"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "300d719975f18aea37fad0300eb8a802a2f3ee17"

S = "${WORKDIR}/git"

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "OpenCV camera driver"
AUTHOR = "Clyde McQueen, Peter Mullen"
ROS_AUTHOR = ""
HOMEPAGE = ""
SECTION = "devel"

ROS_CN = "opencv_cam"
ROS_BPN = "opencv_cam"

ROS_BUILD_DEPENDS = " \
    rclcpp-components \
    rosidl-adapter \
    image-transport \
    image-transport-plugins \
    camera-calibration-parsers \
    class-loader \
    opencv \
    rclcpp \
    ros2-shared \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp-components \
    rosidl-adapter \
    image-transport \
    image-transport-plugins \
    camera-calibration-parsers \
    class-loader \
    opencv \
    rclcpp \
    ros2-shared \
    sensor-msgs \
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
