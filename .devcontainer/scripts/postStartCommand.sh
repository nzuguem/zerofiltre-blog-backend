#!/bin/bash

set -e

# Sourcing of fzf
echo "source <(fzf --bash)" >> /home/vscode/.bashrc

# Start externals services
docker compose up --wait