/*
 * Copyright (C) 2021 Finn Herzfeld
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.finn.signald;
import io.finn.signald.annotations.Deprecated;
import org.whispersystems.signalservice.api.push.ContactTokenDetails;

@Deprecated(1641027661)
class JsonContactTokenDetails {
  public String token;
  public String relay;
  public String number;
  public boolean voice;
  public boolean video;

  JsonContactTokenDetails(ContactTokenDetails contact) {
    this.token = contact.getToken();
    this.relay = contact.getRelay();
    this.number = contact.getNumber();
    this.voice = contact.isVoice();
    this.video = contact.isVideo();
  }
}
