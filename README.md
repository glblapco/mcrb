# mcrb

Self-hosted microblog.

## Usage

`$ java -jar mcrb-0.0.1-SNAPSHOT.jar --username=user --password=password --role=USER`

The `username` argument will be your login username and the `password` argument will
be your login password. The `role` argument can have the values `ADMIN` or `USER`.

Those credentials get stored in-memory, so, they can be changed everytime the software
starts.

Example mcrb website: [bl.blapco.xyz/mcrb](https://bl.blapco.xyz/mcrb)

![mcrb demo video](mcrb_demo.mp4)

## Stack

- Java 11
- SQLite
- Spring Boot
- Thymeleaf

## License

```
Copyright (C) 2022 Biel Polastrini

MCRB
Author: Biel Polastrini
URL: git.blapco.xyz/Personal/mcrb
Version: 0.0.1

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 3
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with mcrb; see the file LICENSE.  If not, go to
<http://www.gnu.org/licenses/gpl3.txt>.
```
