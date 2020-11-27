do_configure[depends] += "kern-tools-native:do_populate_sysroot"

SRC_URI += "file://bsp.cfg"
SRC_URI += "file://user_2019-10-31-20-33-00.cfg"
SRC_URI += "file://user.cfg"
SRC_URI += "file://plnx_kernel.cfg"
SRC_URI += "file://0002-tty-xilinx_uartps-use-version-from-4.19.patch"            
SRC_URI_append = " file://fix_u96v2_pwrseq_simple.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

do_deploy_append () {
	install -m 0644 ${D}/boot/System.map-${KERNEL_VERSION} ${DEPLOYDIR}/System.map.linux
}
