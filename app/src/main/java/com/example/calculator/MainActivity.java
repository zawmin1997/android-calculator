package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonClearMemory,buttonAddMemry,buttonSubMemory,
           buttonRecallMemory,buttonClear,buttonDelete,buttonDivide,
           buttonMulti,buttonSub,buttonAdd,buttonEqual,buttonZero,buttonOne,buttonTwo,
           buttonthree,buttonFour,buttonFive,buttonSix,buttonSeven,buttonEight,buttonNine,buttonPoint,
            buttonSine,buttonCos,buttonTan,buttonCot,buttonSec,buttonCosec,buttonSquareRoot,buttonInvert,buttonSquare,buttonLog;
    TextView text1,text2;
    Double value1,value2,value3,submemory,trigo;

    int currentAdd,currentSub,currentMulti,currentDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonZero = findViewById(R.id.buttonZero);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonthree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonDelete = findViewById(R.id.buttonDelete);
        buttonClear = findViewById(R.id.buttonClear);
        buttonAddMemry = findViewById(R.id.buttonAddMemory);
        buttonSubMemory = findViewById(R.id.buttonSubMemory);
        buttonClearMemory = findViewById(R.id.buttonClearMemory);
        buttonRecallMemory = findViewById(R.id.buttonRecallMemory);
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonSine = findViewById(R.id.buttonSin);
        buttonCos = findViewById(R.id.buttonCos);
        buttonCosec = findViewById(R.id.buttonCosec);
        buttonTan = findViewById(R.id.buttonTan);
        buttonCot = findViewById(R.id.buttonCot);
        buttonSec = findViewById(R.id.buttonSec);
        buttonSquare = findViewById(R.id.buttonSquare);
        buttonLog = findViewById(R.id.buttonLog);

        buttonSquareRoot = findViewById(R.id.buttonSquareRoot);
        buttonInvert = findViewById(R.id.buttonInvert);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);


        buttonAddMemry.setOnClickListener(this);
        buttonSubMemory.setOnClickListener(this);
        buttonClearMemory.setOnClickListener(this);
        buttonRecallMemory.setOnClickListener(this);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText("");
                text1.setText("");
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text2.getText().toString().isEmpty() || text2.getText().toString() == null) {
                    return;
                } else {
                    text2.setText(removeLastChar(text2.getText().toString()));
                }
            }
        });


        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                   text2.setText("0.");
               }
               else if(text2.getText().toString().contains(".")){
                   text2.setText(text2.getText().toString());
               }
               else {
                   text2.setText(text2.getText().toString()+".");
               }
            }
        });


        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    text2.setText(text2.getText()+"0");

            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text2.getText()+"1");
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text2.getText()+"2");
            }
        });

        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text2.getText()+"3");
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text2.getText()+"4");
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text2.getText()+"5");
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text2.getText()+"6");
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text2.getText()+"7");
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text2.getText()+"8");
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text2.getText()+"9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text2.getText().equals(0) || text2.getText().toString().isEmpty()){
                    text2.setText("");
                }
                else {
                    value1 = Double.parseDouble(text2.getText().toString()+"");
                    currentAdd = 1;
                    text2.setText("");
                    text1.setText("+");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text2.getText().equals(0) || text2.getText().toString().isEmpty()){
                    text2.setText("");
                }
                else{
                    value1 = Double.parseDouble(text2.getText().toString()+"");
                    currentSub = 1;
                    text2.setText("");
                    text1.setText("-");
                }
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text2.getText().equals(0) || text2.getText().toString().isEmpty()){
                    text2.setText("");
                }
                else{
                    value1 = Double.parseDouble(text2.getText().toString()+"");
                    currentMulti = 1;
                    text2.setText("");
                    text1.setText("*");
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text2.getText().equals(0) || text2.getText().toString().isEmpty()){
                    text2.setText("");
                }
                else{
                    value1 = Double.parseDouble(text2.getText().toString()+"");
                    currentDivide = 1;
                    text2.setText("");
                    text1.setText("/");
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text2.getText().equals(0) || text2.getText().toString().isEmpty()){
                    text2.setText("");
                    text1.setText("");
                }
                else {
                    value2 = Double.parseDouble(text2.getText().toString() + "");
                    if (currentAdd == 1) {
                        text2.setText(value1 + value2 + "");
                        text1.setText("");
                        currentAdd = 0;
                    } else if (currentSub == 1) {
                        text2.setText(value1 - value2 + "");
                        text1.setText("");
                        currentSub = 0;
                    } else if (currentMulti == 1){
                        text2.setText(value1 * value2 + "");
                        text1.setText("");
                        currentMulti = 0;
                    } else if (currentDivide == 1){
                        text2.setText(value1 / value2 + "");
                        text1.setText("");
                        currentDivide = 0;
                    }
                }
            }
        });

        if(buttonSine != null){
            buttonSine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                        text2.setText("");
                    }else {
                        trigo = Math.sin(Double.parseDouble(text2.getText().toString()));
                        text2.setText(trigo.toString());
                    }
                }
            });
        }
        if(buttonCos != null){
            buttonCos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                        text2.setText("");
                    }else {
                        trigo = Math.cos(Double.parseDouble(text2.getText().toString()));
                        text2.setText(trigo.toString());
                    }
                }
            });
        }
        if(buttonTan != null){
            buttonTan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                        text2.setText("");
                    }else {
                        trigo = Math.tan(Double.parseDouble(text2.getText().toString()));
                        text2.setText(trigo.toString());
                    }
                }
            });
        }
        if(buttonCot != null){
            buttonCot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                        text2.setText("");
                    }else {
                        trigo = 1.0/Math.tan(Double.parseDouble(text2.getText().toString()));
                        text2.setText(trigo.toString());
                    }
                }
            });
        }
        if(buttonSec != null) {
            buttonSec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (text2.getText().toString().isEmpty() || text2.getText().toString() == null) {
                        text2.setText("");
                    } else {
                        trigo = 1.0 / Math.cos(Double.parseDouble(text2.getText().toString()));
                        text2.setText(trigo.toString());
                    }
                }
            });
        }
        if(buttonCosec != null){
                buttonCosec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                            text2.setText("");
                        }else {
                            trigo = 1.0/Math.sin(Double.parseDouble(text2.getText().toString()));
                            text2.setText(trigo.toString());
                        }
                    }
                });
            }
         if(buttonSquareRoot != null){
             buttonSquareRoot.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                         text2.setText("");
                     }else {
                         trigo = Math.sqrt(Double.parseDouble(text2.getText().toString()));
                         text2.setText(trigo.toString());
                     }
                 }
             });
         }
        if(buttonInvert != null){
            buttonInvert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                        text2.setText("");
                    }else {
                        trigo = 1/Double.parseDouble(text2.getText().toString());
                        text2.setText(trigo.toString());
                    }
                }
            });
        }
        if(buttonSquare != null){
            buttonSquare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                        text2.setText("");
                    }else {
                        trigo = Double.parseDouble(text2.getText().toString()) * Double.parseDouble(text2.getText().toString());
                        text2.setText(trigo.toString());
                    }
                }
            });
        }
        if(buttonLog != null){
            buttonLog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                        text2.setText("");
                    }else {
                        trigo = Math.log(Double.parseDouble(text2.getText().toString()));
                        text2.setText(trigo.toString());
                    }
                }
            });
        }
    }
    private static String removeLastChar(String str){
        return str.substring(0,str.length()-1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonAddMemory:
                if(text2.getText().toString().isEmpty() || text2.getText().toString() == null){
                    return;
                }
                else {
                    value3 = Double.parseDouble(text2.getText().toString() + "");
                    Toast.makeText(this, "add memory", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.buttonClearMemory:
                value3 = null;
                Toast.makeText(this, "clear memory", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonSubMemory:
                if(value3 == null){
                    return;
                }else {
                    submemory = value3 - Double.parseDouble(text2.getText().toString() + "");
                    text2.setText(submemory.toString());
                    Toast.makeText(this, "subtract from memory", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.buttonRecallMemory:
                if(value3 == null){
                    return;
                }else {
                    text2.setText(value3.toString());
                    Toast.makeText(this, "recall memory", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
