package org.scalex
package storage
package binary

import model.Database

private[scalex] object ModelToBinary {

  import BinaryFormat.databaseF

  def apply(db: Database): Array[Byte] = sbinary.Operations.toByteArray(db)
}
