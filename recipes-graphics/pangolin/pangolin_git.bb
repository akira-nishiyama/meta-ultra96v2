# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   include/pangolin/utils/xml/license.txt
#   external/pybind11/LICENSE
#   external/pybind11/tools/clang/LICENSE.TXT
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=37611e574d0acc5cc68f827d28a9ce8a \
                    file://include/pangolin/utils/xml/license.txt;md5=d63ab70ba21ca0544b03284958324301 \
                    file://external/pybind11/LICENSE;md5=beb87117af69fd10fbf9fb14c22a2e62 \
                    file://external/pybind11/tools/clang/LICENSE.TXT;md5=dfabea443c6c16b6321441a8c8c19705"

SRC_URI = "gitsm://github.com/stevenlovegrove/Pangolin.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "86eb4975fc4fc8b5d92148c2e370045ae9bf9f5d"

S = "${WORKDIR}/git"


# NOTE: unable to map the following CMake package dependencies: Pangolin Eigen
inherit cmake
inherit python3native

DEPENDS = "libeigen glew virtual/libgl"

FILES_SOLIBSDEV = ""

FILES_${PN} += " ${libdir}/libpangolin.so"
FILES_${PN} += " ${bindir}/*"
FILES_${PN}-dev += " ${includedir}/*"


# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

