# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c7fd69dd4598933b899da7fae7af43d2"

SRC_URI = "git://gitlab.com/boldhearts/ros2_v4l2_camera.git;protocol=https;branch=foxy"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "65b072565f8e4520d166b725d91d5f31acd97610"

S = "${WORKDIR}/git"

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "A ROS 2 camera driver using Video4Linux2"
AUTHOR = "Sander G. van Dijk"
ROS_AUTHOR = ""
HOMEPAGE = ""
SECTION = "devel"

ROS_CN = "v4l2_camera"
ROS_BPN = "v4l2_camera"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    image-transport \
    image-transport-plugins \
    camera-info-manager \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-components \
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

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
