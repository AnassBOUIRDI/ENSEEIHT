node EDGE
  (X: bool)
returns
  (Y: bool);

let
  Y = (X -> (X and (not (pre X))));
tel

