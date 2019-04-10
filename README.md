# Tutorium für Betriebssysteme

Dies ist das offiziele Repository für das Tutorium in Bertiebssysteme bei Robert Fuchs.
Die Inhalte beziehen sich größten Teils auf die Folien von Professor Fuchß, mit eventuell kleinen Exkursen in andere Themengebiete.

Jegliche Inhalte stehen dem Nutzer frei zur Verfügung.

## Themen

- [Prozesse](https://github.com/Treborium/BS-Tutorium/tree/master/Prozesse)
- [Scheduling](https://github.com/Treborium/BS-Tutorium/tree/master/Scheduling)
- [Festplatten](https://github.com/Treborium/BS-Tutorium/tree/master/Festplatten)

## Struktur

Die Vorlesungsthemen sind in seperaten Ordnern mit den entpsrechenden Themen-Namen zu finden.
In der Regel wird versucht die Ordnertiefe möglichst gering zu halten, und Unterordner nur hinzuzufügen wenn es der Übersichtlichkeit hilft. 

Allerdings ist es möglich das Unterordner für weiterführende Themen oder Beispiele exisiteren.

<p align="center">
  <img src="https://github.com/Treborium/BS-Tutorium/blob/master/res/images/repo-hierarchy.png" alt="Example file hierarchy"/>
</p>

> Dies ist nur ein Beispielbild und zeigt nicht notwendigerweise die tatsächliche Repo-Struktur.

## Markdown konvertieren

Falls sich jemand mit Markdown nicht wohl fühlt so kann Markdown mithilfe eines Tools in fast jedes andere Markup-Format konvertiert werden.

Ein solches Tool ist zum Beispiel [Pandoc](http://pandoc.org/index.html). Es kann auf allen gängigen Betriebssystemen [installiert](http://pandoc.org/installing.html) werden und besitzt eine detaillierte [Dokumentation](http://pandoc.org/MANUAL.html).

Markdown in Word-Dokument konvertieren:  
`pandoc -o ausgabe-datei.docx -f markdown -t docx eingabe-datei.md`

## Beispiele kompilieren

Alle Beispielprogramme die in C oder C++ geschrieben sind können durch folgenden Befehl mithilfe von `gcc` kompiliert werden:
`gcc source.c -Wall -Og -o outputFile`

## Kontakt

> furo1013@hs-karlsruhe.de
