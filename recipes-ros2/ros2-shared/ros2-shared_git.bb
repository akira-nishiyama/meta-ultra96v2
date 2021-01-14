# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f291781eb70f566623f1fe31190fb837"

SRC_URI = "git://github.com/ptrmu/ros2_shared.git;protocol=https;branch=eloquent"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "01b6b31d914819fb280d33d713ac5e2e4ad4edad"

S = "${WORKDIR}/git"

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "Shared code for ROS2"
AUTHOR = "Peter Mullen"
ROS_AUTHOR = ""
HOMEPAGE = ""
SECTION = "devel"

ROS_CN = "ros2_shared"
ROS_BPN = "ros2_shared"

ROS_BUILD_DEPENDS = " \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

FILES_${PN} += "*"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
