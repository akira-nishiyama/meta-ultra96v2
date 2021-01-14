DESCRIPTION = "PETALINUX image definition for ultra96v2 boards with wifi."
LICENSE = "MIT"

require recipes-core/images/petalinux-image-common.inc 

IMAGE_FEATURES_append = " package-management"

CORE_IMAGE_EXTRA_INSTALL_append = " packagegroup-base-extended"
CORE_IMAGE_EXTRA_INSTALL_append = " wilc"
CORE_IMAGE_EXTRA_INSTALL_append = " wilc3000-fw"
CORE_IMAGE_EXTRA_INSTALL_append = " wpa-supplicant"
CORE_IMAGE_EXTRA_INSTALL_append = " ultra96-ap-setup"
CORE_IMAGE_EXTRA_INSTALL_append = " ultra96-misc"
CORE_IMAGE_EXTRA_INSTALL_append = " ultra96-wpa"
CORE_IMAGE_EXTRA_INSTALL_append = " connman"
CORE_IMAGE_EXTRA_INSTALL_append = " connman-tools"
CORE_IMAGE_EXTRA_INSTALL_append = " connman-client"
CORE_IMAGE_EXTRA_INSTALL_append = " bluez5"
CORE_IMAGE_EXTRA_INSTALL_append = " usbutils"
CORE_IMAGE_EXTRA_INSTALL_append = " ethtool"
CORE_IMAGE_EXTRA_INSTALL_append = " i2c-tools"
CORE_IMAGE_EXTRA_INSTALL_append = " parted"
CORE_IMAGE_EXTRA_INSTALL_append = " e2fsprogs"
CORE_IMAGE_EXTRA_INSTALL_append = " e2fsprogs-resize2fs"
CORE_IMAGE_EXTRA_INSTALL_append = " e2fsprogs-e2fsck"
CORE_IMAGE_EXTRA_INSTALL_append = " e2fsprogs-mke2fs"

CORE_IMAGE_EXTRA_INSTALL_append = " xrt"
CORE_IMAGE_EXTRA_INSTALL_append = " xrt-dev"
CORE_IMAGE_EXTRA_INSTALL_append = " zocl"
CORE_IMAGE_EXTRA_INSTALL_append = " opencl-clhpp-dev"
CORE_IMAGE_EXTRA_INSTALL_append = " opencl-headers-dev"
CORE_IMAGE_EXTRA_INSTALL_append = " packagegroup-petalinux-opencv"
CORE_IMAGE_EXTRA_INSTALL_append = " packagegroup-petalinux-vitisai"
CORE_IMAGE_EXTRA_INSTALL_append = " packagegroup-petalinux-vitisai-dev"

#ORB_SLAM2
CORE_IMAGE_EXTRA_INSTALL_append = " orb-slam2"
#CORE_IMAGE_EXTRA_INSTALL_append = " ros2-v4l2-camera"
CORE_IMAGE_EXTRA_INSTALL_append = " image-tools"
CORE_IMAGE_EXTRA_INSTALL_append = " ros-core"
CORE_IMAGE_EXTRA_INSTALL_append = " opencv-cam"

CORE_IMAGE_EXTRA_INSTALL_append = " v4l-utils"


#TOOLCHAIN_TARGET_TASK_append = " ament-cmake-libraries-dev ament-package-dev ament-cmake-export-definitions-dev"
#TOOLCHAIN_TARGET_TASK_append = " ament-cmake-export-include-directories-dev ament-cmake-export-interfaces-dev"
#TOOLCHAIN_TARGET_TASK_append = " ament-cmake-export-libraries-dev ament-cmake-export-link-flags-dev"
#TOOLCHAIN_TARGET_TASK_append = " ament-cmake-python-dev"
#TOOLCHAIN_TARGET_TASK_append = "
#    foonathan-memory-staticdev
#    python3-catkin-pkg
#"

TOOLCHAIN_TARGET_TASK_append = " rclcpp"
TOOLCHAIN_TARGET_TASK_append = " std-msgs"
TOOLCHAIN_TARGET_TASK_append = " geometry-msgs"
TOOLCHAIN_TARGET_TASK_append = " tf2-geometry-msgs"
TOOLCHAIN_TARGET_TASK_append = " cv-bridge"
TOOLCHAIN_TARGET_TASK_append = " image-common"
TOOLCHAIN_TARGET_TASK_append = " image-transport"
TOOLCHAIN_TARGET_TASK_append = " tf2-ros"
TOOLCHAIN_TARGET_TASK_append = " sensor-msgs"
TOOLCHAIN_TARGET_TASK_append = " rosidl-default-generators"
TOOLCHAIN_TARGET_TASK_append = " foonathan-memory-staticdev"
TOOLCHAIN_TARGET_TASK_append = " foonathan-memory-vendor"
TOOLCHAIN_TARGET_TASK_append = " libstdc++-staticdev"

TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake nativesdk-ament-cmake-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-libraries nativesdk-ament-cmake-libraries-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-ros nativesdk-ament-cmake-ros-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-export-definitions nativesdk-ament-cmake-export-definitions-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-export-include-directories nativesdk-ament-cmake-export-include-directories-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-export-interfaces nativesdk-ament-cmake-export-interfaces-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-export-libraries nativesdk-ament-cmake-export-libraries-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-export-link-flags nativesdk-ament-cmake-export-link-flags-dev"
#TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-export-targets nativesdk-ament-cmake-export-targets-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-python nativesdk-ament-cmake-python-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-target-dependencies nativesdk-ament-cmake-target-dependencies-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-include-directories nativesdk-ament-cmake-include-directories-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-version nativesdk-ament-cmake-version-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-gmock nativesdk-ament-cmake-gmock-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-cmake-gtest nativesdk-ament-cmake-gtest-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-package nativesdk-ament-package-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-rosidl-default-generators nativesdk-rosidl-default-generators-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-python-cmake-module nativesdk-python-cmake-module-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-index-python nativesdk-ament-index-python-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-rosidl-cmake nativesdk-rosidl-cmake-dev"
#TOOLCHAIN_HOST_TASK_append = " nativesdk-rosidl-typesupport-c nativesdk-rosidl-typesupport-c-dev"
#TOOLCHAIN_HOST_TASK_append = " nativesdk-rosidl-typesupport-interface nativesdk-rosidl-typesupport-interface-dev"
TOOLCHAIN_HOST_TASK_append = " nativesdk-python3-numpy"

#TOOLCHAIN_HOST_TASK_append = " nativesdk-ament-package nativesdk-rosidl-adapter
#                               nativesdk-python3-numpy nativesdk-ament-cmake
#                               nativesdk-cmake
#"

