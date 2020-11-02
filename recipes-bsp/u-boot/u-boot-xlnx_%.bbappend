FILESEXTRAPATHS_prepend_ultra96v2-zynqmp := "${THISDIR}/files:"

SRC_URI_append_ultra96v2-zynqmp = " file://fragment.cfg"
SRC_URI_append_ultra96v2-zynqmp = " file://platform-top.h"

do_configure_append_ultra96v2-zynqmp () {
	install ${WORKDIR}/platform-top.h ${S}/include/configs/
}
