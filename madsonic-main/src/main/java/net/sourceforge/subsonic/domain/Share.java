/*
 This file is part of Subsonic.

 Subsonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Subsonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Subsonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2009 (C) Sindre Mehus
 */
package net.sourceforge.subsonic.domain;

import java.util.Date;

/**
 * A collection of media files that is shared with someone, and accessible via a direct URL.
 *
 * @author Sindre Mehus
 * @version $Id: Share.java 3403 2013-04-12 09:00:47Z sindre_mehus $
 */
public class Share {

    private int id;
    private String name;
    private String description;
    private String username;
    private Date created;
    private Date expires;
    private Date lastVisited;
    private int visitCount;

    public Share() {
    }

    public Share(int id, String name, String description, String username, Date created,
            Date expires, Date lastVisited, int visitCount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.username = username;
        this.created = created;
        this.expires = expires;
        this.lastVisited = lastVisited;
        this.visitCount = visitCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public Date getLastVisited() {
        return lastVisited;
    }

    public void setLastVisited(Date lastVisited) {
        this.lastVisited = lastVisited;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
