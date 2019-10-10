using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using TicketSalling;

namespace TicketSalling
{
    public partial class Form3 : Form
    {
        private Flight flight3;
        private int numb3;
        Random rnd;
        int hours;
        int rating;
        Pilot pilot;
        public Form3(Flight flight, int numb2)
        {
            rnd = new Random();
            hours = rnd.Next(5000, 14000);
            rating = rnd.Next(6, 10);
            DateTime pilotB = new DateTime(1971, 03, 21);
            pilot = new Pilot("male", "Vitaliy", "Ivanovich", pilotB , hours, rating);
            flight3 = flight;
            numb3 = numb2;
            InitializeComponent();
        }


        private void Form3_Load(object sender, EventArgs e)
        {

            FlightInf.Text = flight3.ToString() + "   " + " Pilot: " + pilot.ToString();

            string[] SexArr =
            {
                "Abimegender", "Aethergender", "Archaigender", "Astergender", "Astralgender", "Biogender", "Blizzgender", "Boggender", "Caelgender", "Carmigender", "Circgender", "Colorgender", "Contigender", "Crystagender", "Daimogender", "Delphigender", "Dryagender",
                "Earthgender", "Ekragender", "Digitalgender", "Frostgender", "Leukogender", "Orbgender", "Pictogender", "Absorgender", "Cadensgender", "Anongender"
            };
            SexBox.Items.AddRange(SexArr);

        }

        private void Button1_Click_1(object sender, EventArgs e)
        {
            try
            {

           
            string sex = SexBox.Text;
            string Name = NameBox.Text;
            string LastN = SecBox.Text;
            DateTime passengerBirthDay = BirthTime.Value.Date;
            long document = Int64.Parse(Document.Text);
            DateTime date = Date.Value.Date;
            Passenger passanger = new Passenger(sex, Name, LastN, passengerBirthDay, document, date);
            Ticket ticket = new Ticket(flight3, passanger, pilot);
            Form4 form4 = new Form4(ticket);
            flight3.PassN(numb3);
            flight3.airplane.Reduce(flight3.passengersN);
            this.Hide();
            form4.Show();
            }
            catch (Exception exception)
            {
                MessageBox.Show(exception.Message);
            }
        }

        private void NameBox_KeyPress(object sender, KeyPressEventArgs e)
        {
            var numb = e.KeyChar;
            if (char.IsDigit(numb))
            {
                e.Handled = true;
            }
        }

        private void SecBox_KeyPress(object sender, KeyPressEventArgs e)
        {
            var numb = e.KeyChar;
            if (char.IsDigit(numb))
            {
                e.Handled = true;
            }
        }

        private void Document_KeyPress(object sender, KeyPressEventArgs e)
        {
            var numb = e.KeyChar;
            if (!char.IsDigit(numb))
            {
                e.Handled = true;
            }
        }
    }
}