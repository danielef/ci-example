#!/usr/bin/env bash
#
# Distro Publisher
#

echo "TOKEN:$1"

export MKD_PATH="$(cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )" && \
export ROOT_PATH=$(dirname $MKD_PATH) && \
export PROJECT=$( grep "defproject" $ROOT_PATH/project.clj ) && \
export SERVICE_NAME=$( echo $PROJECT | awk '{split($2,t0,"/"); print(t0[2])}' ) && \
export SERVICE_VERSION=$( echo $PROJECT | awk '{print(substr($3,2,length($3)-2))}' ) && \
export DISTRO_DIR=$SERVICE_NAME-$SERVICE_VERSION && \
export FILE_DISTRO=$DISTRO_DIR.tgz

curl -v -u "ci:$1" --upload-file $ROOT_PATH/$FILE_DISTRO "https://ci.interware.mx/nexus/repository/interware-distro/$FILE_DISTRO"
