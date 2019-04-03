#!/bin/bash

# Copyright 2019 The Chromium Authors. All rights reserved.
# Use of this source code is governed by a BSD-style license that can be
# found in the LICENSE file.

MYPATH=$(dirname "${BASH_SOURCE[0]}")

source "$MYPATH/cipd_bin_setup.sh"
cipd_bin_setup &> /dev/null

exec "$MYPATH/.cipd_bin/bb" "$@"
