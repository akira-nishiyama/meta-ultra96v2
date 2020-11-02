FILESEXTRAPATHS_prepend_ultra96v2-zynqmp := "${THISDIR}/files:"

SYSTEM_USER_DTSI ?= "system-user.dtsi"

SRC_URI_append_ultra96v2-zynqmp ="\
    file://openamp.dtsi \
    file://${SYSTEM_USER_DTSI} \
"

do_configure_append_ultra96v2-zynqmp() {
    cp ${WORKDIR}/${SYSTEM_USER_DTSI} ${B}/devicce-tree
    echo "/include/ \"${SYSTEM_USER_DTSI}\"" >> ${B}/device-tree/system-top.dts
}

YAML_CONSOLE_DEVICE_CONFIG_ultra96v2-zynqmp = "psu_uart_1"

