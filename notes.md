ImageSummaryApp: have three command-line arguments that are imageinputpath, hex target color and threshold. Threshold decides how close does a pixel color need to be to the target color.

ColorDistanceFinder: Computes the distance between two colors Each color is represented as a 24-bit integer (0xRRGGBB) where the red, green, and blue components can be xtracted using bit shifting and masking. The interface has two parameteres int colorA (the first color as a 24-bit hex RGB integer)and int colorB(the second color as a 24-bit hex RGB integer)

EuclideanColorDistance:
ImageBinarizer:
DistanceImageBinarizer:
ImageGroupFinder:
BinarizingImageGroupFinder:
DfsBinaryGroupFinder:
Group:
