# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

SUMMARY  = "python library"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7713fe42cd766b15c710e19392bfa811"

SRC_URI[md5sum] = "4cb42917ac5007d1cdff6cccfe2d016b"
inherit pypi setuptools3

PYPI_PACKAGE = "cycler"
PV = "0.10.0"

DEPENDS += " \
    python3-numpy-native python3-cython-native \
"

RDEPENDS_${PN} += " \
    python3-json \
    python3-numpy \
    python-latestdateutil \
    python3-pytz \
"
