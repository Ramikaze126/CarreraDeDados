����   A �
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  java/util/Random
  
     nextInt (I)I	      CarreraDados distanciaMeta I	 
   ! " out Ljava/io/PrintStream; $ $¡Bienvenidos a la Carrera de Dados!
 & ' ( ) * java/io/PrintStream println (Ljava/lang/String;)V   , - . makeConcatWithConstants (I)Ljava/lang/String; 0 JugadorConEstrategia 2 	Jugador 1
 / 4  * 6 	Jugador 2 8 Jugador
 / : ; < 	getNombre ()Ljava/lang/String;  > - ? &(Ljava/lang/String;)Ljava/lang/String;  , B Elige una acción:  ,  ,
  F  G ()I
 / I J K avanzar (I)V
 / M N K 
retroceder P par R impar  T - U '(Ljava/lang/String;I)Ljava/lang/String;
 / W X Y revisarVictoria ()Z  >
  \ ]  close Code LineNumberTable LocalVariableTable this LCarreraDados; main ([Ljava/lang/String;)V 	retroceso jugadorActual LJugadorConEstrategia; rival dado eleccion args [Ljava/lang/String; sc Ljava/util/Scanner; rand Ljava/util/Random; jugador1 jugador2 	jugadores 
[LJugador; turno StackMapTable l t z java/lang/String 
SourceFile Movimiento.java BootstrapMethods  La meta está a  posiciones.
 � 
Turno de  � Dado:  � 1. Avanzar  posiciones � ,2. Hacer que el rival retroceda  posiciones � 4Como el dado fue , el rival retrocede  posiciones. � 
¡ ha ganado la carrera! �
 � � � - � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup        	           ^   /     *� �    _       K `        a b   	 c d  ^  �    5� Y� 	� L� Y� M2,� `� � #� %� � � +  � %� /Y1� 3N� /Y5� 3:� 7Y-SYS:6p2� /:`p2� /:� � 9� =  � %,� `6	� 	� @  � %� A� %� 	� C  � %� 	� D  � %+� E6

� 	� H� =
� 7	p� 
	l� 	6� L� 	p� O� Q� S  � %� V� � � 9� Z  � %� 	���/+� [�    _   ~    O  P  S  T ' U 5 X ? Y J [ Y \ \ ` h a v c � d � e � g � h � i � k � l � m � n � o � p � q u v' w* z- {0 }4 ~ `   z  � " e   h � f g  v � h g  � � i  	 � h j  
  5 k l   * m n  " o p  ? � q g  J � r g  Y � s t  \ � u   v   � 	� \  w   / / x  � x  w   / / x / /  A�   w   / / x / /  &�   w   / / x / /  & y� 	�   w   / / x    {    | }   ,  �  ~ �  � �  � �  � �  � �  � �  � �   
  � � � 