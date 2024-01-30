# BargeSimulator

Ce projet vise à modéliser le transport de conteneurs à travers différents modes de transport tels que barges, trains et camions. L'organisation des services, définie par des dates et heures de passages en différents points et terminaux, est précalculée par un modèle d'optimisation. Les services comprennent des étapes de chargement/déchargement en terminaux, ainsi que des déplacements/transits entre terminaux consécutifs, appelés legs. Chaque service a une capacité spécifiée, déterminant le nombre maximal de conteneurs ou de barges associés à ce service pour chaque cycle.

Chaque service est caractérisé par une route définie par un chemin dans le graphe espace-temps du terminal de départ à celui d'arrivée, avec des arrêts dans des terminaux intermédiaires. Les itinéraires précisent le routage utilisé pour déplacer une partie de la demande correspondante, comprenant les terminaux d'origine et de destination, ainsi que la séquence des services entre chaque paire de terminaux consécutifs.

La demande de produit est notée dp, et les variables hlp représentent le volume de produit p déplacé en utilisant un itinéraire donné. L'objectif est de découper la demande de manière à utiliser simultanément plusieurs itinéraires entre le terminal d'origine et celui de destination, permettant une flexibilité similaire au transfert de paquets sur le réseau Internet.
