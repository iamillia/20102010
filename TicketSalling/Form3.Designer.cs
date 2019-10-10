namespace TicketSalling
{
    partial class Form3
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.SexBox = new System.Windows.Forms.ComboBox();
            this.button1 = new System.Windows.Forms.Button();
            this.Document = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.NameBox = new System.Windows.Forms.TextBox();
            this.SecBox = new System.Windows.Forms.TextBox();
            this.Date = new System.Windows.Forms.DateTimePicker();
            this.FlightInf = new System.Windows.Forms.TextBox();
            this.BirthTime = new System.Windows.Forms.DateTimePicker();
            // 
            // SexBox
            // 
            this.SexBox.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.SexBox.FormattingEnabled = true;
            this.SexBox.Location = new System.Drawing.Point(52, 251);
            this.SexBox.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.SexBox.Name = "SexBox";
            this.SexBox.Size = new System.Drawing.Size(121, 28);
            this.SexBox.TabIndex = 3;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(838, 481);
            this.button1.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(102, 38);
            this.button1.TabIndex = 4;
            this.button1.Text = "book ticket";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.Button1_Click_1);
            // 
            // Document
            // 
            this.Document.Location = new System.Drawing.Point(52, 391);
            this.Document.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Document.Name = "Document";
            this.Document.Size = new System.Drawing.Size(189, 27);
            this.Document.TabIndex = 6;
            this.Document.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.Document_KeyPress);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(49, 226);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 20);
            this.label1.TabIndex = 7;
            this.label1.Text = "Sex:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(246, 226);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(52, 20);
            this.label2.TabIndex = 8;
            this.label2.Text = "Name:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(466, 226);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(102, 20);
            this.label3.TabIndex = 9;
            this.label3.Text = "Second name:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(730, 226);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(69, 20);
            this.label4.TabIndex = 10;
            this.label4.Text = "BirthDay:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(49, 336);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(99, 20);
            this.label5.TabIndex = 11;
            this.label5.Text = "Document №";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(290, 336);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(106, 20);
            this.label6.TabIndex = 12;
            this.label6.Text = "Date of Expiry:";
            // 
            // NameBox
            // 
            this.NameBox.Location = new System.Drawing.Point(249, 251);
            this.NameBox.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.NameBox.Name = "NameBox";
            this.NameBox.Size = new System.Drawing.Size(155, 27);
            this.NameBox.TabIndex = 13;
            this.NameBox.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.NameBox_KeyPress);
            // 
            // SecBox
            // 
            this.SecBox.Location = new System.Drawing.Point(469, 251);
            this.SecBox.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.SecBox.Name = "SecBox";
            this.SecBox.Size = new System.Drawing.Size(171, 27);
            this.SecBox.TabIndex = 14;
            this.SecBox.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.SecBox_KeyPress);
            // 
            // Date
            // 
            this.Date.Location = new System.Drawing.Point(293, 391);
            this.Date.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Date.Name = "Date";
            this.Date.Size = new System.Drawing.Size(178, 27);
            this.Date.TabIndex = 16;
            // 
            // FlightInf
            // 
            this.FlightInf.Location = new System.Drawing.Point(52, 49);
            this.FlightInf.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.FlightInf.Multiline = true;
            this.FlightInf.Name = "FlightInf";
            this.FlightInf.ReadOnly = true;
            this.FlightInf.Size = new System.Drawing.Size(813, 80);
            this.FlightInf.TabIndex = 17;
            // 
            // BirthTime
            // 
            this.BirthTime.Location = new System.Drawing.Point(730, 252);
            this.BirthTime.Name = "BirthTime";
            this.BirthTime.Size = new System.Drawing.Size(250, 27);
            this.BirthTime.TabIndex = 18;
            // 
            // Form3
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1087, 562);
            this.Controls.Add(this.BirthTime);
            this.Controls.Add(this.FlightInf);
            this.Controls.Add(this.Date);
            this.Controls.Add(this.SecBox);
            this.Controls.Add(this.NameBox);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.Document);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.SexBox);
            this.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Name = "Form3";
            this.Text = "Form3";
            this.Load += new System.EventHandler(this.Form3_Load);

        }

        #endregion
        private System.Windows.Forms.ComboBox SexBox;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox Document;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox NameBox;
        private System.Windows.Forms.TextBox SecBox;
        private System.Windows.Forms.DateTimePicker Date;
        private System.Windows.Forms.TextBox FlightInf;
        private System.Windows.Forms.DateTimePicker BirthTime;
    }
}