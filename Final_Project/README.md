<div align="center">

![Logos](https://i.imgur.com/DKIVS3c.png)

## TECNOLÓGICO NACIONAL DE MÉXICO | INSTITUTO TECNOLÓGICO DE TIJUANA

SUBDIRECCIÓN ACADÉMICA
 
DEPARTAMENTO DE SISTEMAS Y COMPUTACIÓN
 
SEMESTRE ENERO 2021 - JULIO 2021

INGENIERÍA INFORMÁTICA


### PROFESSOR

JOSÉ CHRISTIAN ROMERO HERNÁNDEZ

### CLASS

BIG DATA 

### FINAL PROJECT

### TEAM

16211976	BERMUDEZ ORNELAS ALBERTO

16212372      ZUÑIGA SOSA RUBEN



**TIJUANA, BAJA CALIFORNIA, JUNE 2021** 
</div>


# INDEX
- [INDEX](#index)
- [INTRODUCTION](#introduction)
- [THEORETICAL FRAMEWORK](#theoretical-framework)
  - [Support Vector Machine](#support-vector-machine)
  - [Decision Tree](#decision-tree)
  - [Logistic Regression](#logistic-regression)
  - [Multilayer Perceptron](#multilayer-perceptron)
- [IMPLEMENTATION](#implementation)
- [RESULTS](#results)
- [CONCLUSIONS](#conclusions)
- [REFERENCES](#references)

<div align="justify"> 


# INTRODUCTION

In the following document we will be able to appreciate the notable differences that exist by comparing different algorithms based on a series of tests done on a specific data frame and a certain amount of repetitions.Obtaining in this way data such as the precision of the algorithm among other data interesting

# THEORETICAL FRAMEWORK

## Support Vector Machine
Support Vector Machines (SVM) are powerful tools of machine learning for data classification and prediction (Vapnik, 1995).The problem of the separation of two classes is solved using a hyperplane that maximizes the margin between classes. The data points found in the margins are called support vectors.The SVM algorithm seeks to find the hyperplane that creates the greatest margin between theformation points of the two classes. 

![image](https://drive.google.com/uc?export=view&id=170w_NpGlL90S8wawc5SB2u39_fCGtwZR)

It also penalizes the total distance of the points found inthe wrong side of your marginas long as there is overlap between the two kinds of data. This allows a number to be tolerated limited misclassificationscloseofmargin.Theotherkey feature in SVM is theuse of kernel functions and penalty parameter for convert the nonlinear limits into the parameter space entries on linear boundaries in some larger transformed space. On The following figure illustrates the representation of a two-class problem in atwo-dimensional space using SVM. Here, the demarcation of the boundaries betweenred and blue classes (left panel) shows a predominantly space continuous for the red class with embedded blue bags. [1]

![image](https://drive.google.com/uc?export=view&id=1_QZVLwLL0Zd91CwXUkDPgeeTpRnaRBBl)

## Decision Tree
A Decision Tree (or Decision Trees) is an analytical method that througha schematic representation of the available alternatives makes it easier tobetter decisions, especially when there are risks, costs, benefits andmultiple choices. The name is derived from the appearance of the model resembling atree and its use is wide in the field of decision making under uncertainty(Decision Theory) together with other tools such as the Analysis of the Balance. [2]


![image](https://drive.google.com/uc?export=view&id=14wo8NpvhWWD_0ELYNj8Qzh_7aKc75TkL)

A tree can be "learned" by dividing the source set into subsetsbased on an attribute value test. This process is repeated for each subsetderived in a recursive way called recursive partitioning. Recursionis completed when the subset in a node has the same value of the variabletarget, or when division no longer adds value to predictions. The trees ofdecision can handle large data. In general, the classifier ofdecision tree has good precision. Decision tree induction is atypical inductive approach to learning classification knowledge. [3]


## Logistic regression
Logistic regression is a popular method for predicting a categorical response. It is a special case of generalized linear models that predicts the probability From the results. In spark. ml, logistic regression can be used to predicta binary result by using binomial logistic regression, or you canuse to predict a multiclass outcome using regression multinomial logistics. Use the family parameter to select between these twoalgorithms, or leave it unconfigured and Spark will deduce the correct variant.

## Multilayer Perceptron
The multilayer perceptron classifier (MLPC) is a classifier based on the feedforward artificial neural network. MLPC consists of multiple layers of nodes. Each layer is fully connected to the next layer in the network. The nodes in the input layer represent the input data. All other nodes map inputs to outputs by a linear combination of the inputs with the node weights w and the bias by applying an activation function.

![image](https://drive.google.com/uc?export=view&id=1cEbhpD-SsU6rrDsJkW0kQ07KwLHX2GYn)

# IMPLEMENTATION
It was decided to use the spark language for this project due to its great versatility when it comes to manipulating large amounts of data, managing to analyze them in a fairly good time. Spark provides APIs for Python, Java and Scala, we chose Scala because it is a functional language that allows us to implement the MapReduce paradigm easily and quickly. Scala works in the JVM, which allows us to have the multiple libraries created for Java. Visual studio code was also used as a viewer as a code editor since it allows us to open several terminal instances, as well as its integration with gitHub, which allows us to work in pairs. The operating system used was windows, which was for convenience, since we would not have to start a virtual machine with linux to be able to work, which did not save much time and speeds up the process.

# RESULTS



|              	| SVM     	| Decision Tree 	| Logistic Regression 	| Multilayer Perceptron 	|
|--------------	|---------	|---------------	|---------------------	|-----------------------	|
| Accuracy     	| 88.30 % 	| 89.3 %        	| 88.7%               	| 88.2%                 	|
| Timer(S) 	| 6.55    	| 0.66          	| 1.155               	| 7.40                  	|


# CONCLUSIONS
The different algorithms that we reviewed tended to vary very little, this could be for different reasons such as: the system in which it was tested, the amount of data selected, the types of data selected, even the capacity of the algorithm generated based on our knowledge.
As a general knowledge we can conclude that these algorithms work stably even in the presence of a very large amount of data. And in particular the language chosen for this means that everything is carried in a lighter and more comfortable way for our machine, in this case Scala. In the end we can conclude that the Decision Tree algorithm is the most efficient since it presents an average speed of 0.66 seconds together with a precision of 89.3%, which is the highest among all the other algorithms.

# REFERENCES

Mishra, S. (2017, 21 julio). Support Vector Machine - an overview | ScienceDirect Topics. Https://Www.Sciencedirect.Com. https://www.sciencedirect.com/topics/earth-and-planetary-sciences/support-vector-machine [1]

Tutoriales, G. (2016, 7 marzo). Árbol de Decisión (Qué es y para qué sirve). Gestión de Operaciones. https://www.gestiondeoperaciones.net/procesos/arbol-de-decision/ [2]

GeeksforGeeks. (2021, 22 junio). Decision Tree. https://www.geeksforgeeks.org/decision-tree/ [3]

Connelly, L. (2020). Logistic regression. Medsurg Nursing, 29(5), 353-354.
https://www.proquest.com/openview/e8e7564d6f02ac54d757f3b74422f0ef/1?pq-origsite=gscholar&cbl=30764


Logistic Regression
https://www.statisticssolutions.com/free-resources/directory-of-statistical-analyses/what-is-logistic-regression/#:~:text=Logistic%20regression%20is%20the%20appropriate,variable%20is%20dichotomous%20(binary).&text=Logistic%20regression%20is%20used%20to,or%20ratio%2Dlevel%20independent%20variables.


sciencedirect  2021 Elsevier B.V  Multilayer Perceptron
https://www.sciencedirect.com/topics/computer-science/multilayer-perceptrons
