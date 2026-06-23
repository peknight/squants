package com.peknight.squants.instances

import cats.Eq
import squants.information.Information

trait InformationInstances:
  given eqInformation: Eq[Information] = Eq.by(_.toBytes)
end InformationInstances
object InformationInstances extends InformationInstances
