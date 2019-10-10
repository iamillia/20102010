using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using TicketSalling;

namespace TicketSalling
{
    public partial class Form1 : Form

    { 
        DateTimeOffset there;
        DateTimeOffset back;
        static List<Flight> flights = new List<Flight>();
        private bool Exist(List<Flight> flights, Airplane airplane)
        {
            var ex = false;
            for (var i = 0; i < flights.Count; i++)
                if (flights[i].airplane.Equals(airplane))
                {
                    ex = true;
                    break;
                }

            return ex;
        }

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {



            string[] fromArr = { "Borispol", "Zhulany", "Wall Street", "Battery Park", "Domodedovo", "Vnukovo" };
            string[] toArr = { "Borispol", "Zhulany", "Wall Street", "Battery Park", "Domodedovo", "Vnukovo" };
            From.Items.AddRange(fromArr);
            To.Items.AddRange(toArr);
            string[] classArr = { "Any", "Business", "Economy" };
            string[] PassNum = { "1", "2", "3", "4" };
            Passengers.Items.AddRange(PassNum);
            Class.Items.AddRange(classArr);
        }

        private void Button1_Click(object sender, EventArgs e)
        {

            try
            {
                there = There.Value.Date;
                back = Back.Value.Date;
                
                int numb = Convert.ToInt16(Passengers.Text);

                Random rnd = new Random();
                //string[] fromArr = { "Borispol", "Zhulany", "Wall Street", "Battery Park", "Domodedovo", "Vnukovo" };
                //string[] toArr = { "Borispol", "Zhulany", "Wall Street", "Battery Park", "Domodedovo", "Vnukovo" };
                Time time = new Time(There.Value.Date, Back.Value.Date);
                Airports airports = new Airports(From.Text, To.Text);
                //MessageBox.Show(time.there + " " + time.back + "\n"
                //     + place.to + " " + place.from);

                Airplane airplane = new Airplane(time, airports, rnd.Next(200, 400));
                if (Exist(flights, airplane))
                {

                }
                else
                {
                    flights.Add(new Flight(new Airplane(time, airports, rnd.Next(200, 400)), rnd.Next(Int32.MaxValue), rnd.Next(500, 2000)));
                    flights.Add(new Flight(new Airplane(time, airports, rnd.Next(200, 400)), rnd.Next(Int32.MaxValue), rnd.Next(500, 2000)));
                }
                //for (int i = 0; i < From.Items.Count; i++) {
                //    for (int k = 0; k < To.Items.Count; k++) {
                //        if (i != k) {
                //            flights.Add(new Flight(time, new Place(fromArr[i], toArr[k]), rnd.Next(Int32.MaxValue).ToString(), rnd.Next(500, 2000)));
                //        }
                //    }
                //}
                //for (int i = 0; i < From.Items.Count; i++)
                //{
                //    for (int k = 0; k < To.Items.Count; k++)
                //    {
                //        if (i != k)
                //        {
                //            flights.Add(new Flight(time, new Place(fromArr[i], toArr[k]), rnd.Next(Int32.MaxValue).ToString(), rnd.Next(500, 2000)));
                //        }
                //    }
                //}
                //MessageBox.Show(flights[4].place.to + flights[4].race + "   " + flights.Count + "daaaaaaaaaa " + numb );
                //for (int i = 0; i < flights.Count; i++)
                //{
                //    MessageBox.Show(flights[i].place.from + flights[i].place.to + " AAAAAAAAAAAAAAAAAAAAAA");
                //}

                Form2 form2 = new Form2(flights, airplane, numb);
                form2.Show();
                this.Hide();
            }
          
            catch (Exception exception)
            {
                MessageBox.Show(exception.Message);
            }




        }

    }
}

