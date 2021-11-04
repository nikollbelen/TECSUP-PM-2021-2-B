package com.miempresa.usofragmentosv4.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentTransaction
import com.miempresa.usofragmentosv4.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Operaciones.newInstance] factory method to
 * create an instance of this fragment.
 */
class Operaciones : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    fun sumar(num1:Double,num2:Double):Double{
        return  num1 + num2
    }
    fun restar(num1: Double,num2: Double):Double{
        return num1 - num2
    }
    fun product(num1:Double,num2:Double):Double{
        return  num1 * num2
    }
    fun division(num1: Double,num2: Double):Double{
        return num1 / num2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragmento2, container, false)

        val view =
            inflater.inflate(R.layout.fragment_operaciones, container, false)
        var txtNum1 = view.findViewById<EditText>(R.id.txtNum1)
        var txtNum2 = view.findViewById<EditText>(R.id.txtNum2)
        var radioSuma = view.findViewById<Button>(R.id.radioSuma)
        var radioResta = view.findViewById<Button>(R.id.radioResta)
        var radioProducto = view.findViewById<Button>(R.id.radioProducto)
        var radioDivision = view.findViewById<Button>(R.id.radioDivision)
        radioSuma.setOnClickListener(View.OnClickListener {
            val respuesta = Respuesta()
            val args = Bundle()
            var num1 = txtNum1.getText().toString()
            var num2 = txtNum2.getText().toString()
            var operacion = "+"
            var rpta = (sumar(num1.toDouble(),num2.toDouble())).toString()
            args.putString("num1", num1)
            args.putString("num2", num2)
            args.putString("operacion", operacion)
            args.putString("rpta", rpta)
            respuesta.arguments = args
            val transaccion: FragmentTransaction =
                activity!!.supportFragmentManager.beginTransaction()
            transaccion.replace(R.id.contenedorAdicional, respuesta)
            transaccion.commit()
        })
        radioResta.setOnClickListener(View.OnClickListener {
            val respuesta = Respuesta()
            val args = Bundle()
            var num1 = txtNum1.getText().toString()
            var num2 = txtNum2.getText().toString()
            var operacion = "-"
            var rpta = (restar(num1.toDouble(),num2.toDouble())).toString()
            args.putString("num1", num1)
            args.putString("num2", num2)
            args.putString("operacion", operacion)
            args.putString("rpta", rpta)
            respuesta.arguments = args
            val transaccion: FragmentTransaction =
                activity!!.supportFragmentManager.beginTransaction()
            transaccion.replace(R.id.contenedorAdicional, respuesta)
            transaccion.commit()
        })
        radioProducto.setOnClickListener(View.OnClickListener {
            val respuesta = Respuesta()
            val args = Bundle()
            var num1 = txtNum1.getText().toString()
            var num2 = txtNum2.getText().toString()
            var operacion = "x"
            var rpta = (product(num1.toDouble(),num2.toDouble())).toString()
            args.putString("num1", num1)
            args.putString("num2", num2)
            args.putString("operacion", operacion)
            args.putString("rpta", rpta)
            respuesta.arguments = args
            val transaccion: FragmentTransaction =
                activity!!.supportFragmentManager.beginTransaction()
            transaccion.replace(R.id.contenedorAdicional, respuesta)
            transaccion.commit()
        })
        radioDivision.setOnClickListener(View.OnClickListener {
            val respuesta = Respuesta()
            val args = Bundle()
            var num1 = txtNum1.getText().toString()
            var num2 = txtNum2.getText().toString()
            var operacion = "/"
            var rpta = (division(num1.toDouble(),num2.toDouble())).toString()
            args.putString("num1", num1)
            args.putString("num2", num2)
            args.putString("operacion", operacion)
            args.putString("rpta", rpta)
            respuesta.arguments = args
            val transaccion: FragmentTransaction =
                activity!!.supportFragmentManager.beginTransaction()
            transaccion.replace(R.id.contenedorAdicional, respuesta)
            transaccion.commit()
        })

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Operaciones.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Operaciones().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}