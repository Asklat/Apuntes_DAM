﻿#pragma checksum "..\..\MainWindow.xaml" "{8829d00f-11b8-4213-878b-770e8597ac16}" "58E4B9CC9B3B4E00FE387713D14CDC0181B262C3714256BDA9CAC2F543E46A3B"
//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

using Actividad21_2;
using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace Actividad21_2 {
    
    
    /// <summary>
    /// MainWindow
    /// </summary>
    public partial class MainWindow : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 1 "..\..\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal Actividad21_2.MainWindow VentanaPrincipal;
        
        #line default
        #line hidden
        
        
        #line 11 "..\..\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBlock menuCombatSkills;
        
        #line default
        #line hidden
        
        
        #line 23 "..\..\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBlock menuSignsSkills;
        
        #line default
        #line hidden
        
        
        #line 31 "..\..\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBlock menuAlchemySkills;
        
        #line default
        #line hidden
        
        
        #line 40 "..\..\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBlock menuGeneralSkills;
        
        #line default
        #line hidden
        
        
        #line 49 "..\..\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBlock menuMutagens;
        
        #line default
        #line hidden
        
        
        #line 58 "..\..\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBlock menuMutations;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/Actividad21-2;component/mainwindow.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\MainWindow.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.VentanaPrincipal = ((Actividad21_2.MainWindow)(target));
            return;
            case 2:
            this.menuCombatSkills = ((System.Windows.Controls.TextBlock)(target));
            
            #line 11 "..\..\MainWindow.xaml"
            this.menuCombatSkills.MouseEnter += new System.Windows.Input.MouseEventHandler(this.menuCombatSkills_MouseEnter);
            
            #line default
            #line hidden
            
            #line 11 "..\..\MainWindow.xaml"
            this.menuCombatSkills.MouseLeave += new System.Windows.Input.MouseEventHandler(this.menuCombatSkills_MouseLeave);
            
            #line default
            #line hidden
            return;
            case 3:
            this.menuSignsSkills = ((System.Windows.Controls.TextBlock)(target));
            
            #line 23 "..\..\MainWindow.xaml"
            this.menuSignsSkills.MouseEnter += new System.Windows.Input.MouseEventHandler(this.menuSignsSkills_MouseEnter);
            
            #line default
            #line hidden
            return;
            case 4:
            this.menuAlchemySkills = ((System.Windows.Controls.TextBlock)(target));
            
            #line 31 "..\..\MainWindow.xaml"
            this.menuAlchemySkills.MouseEnter += new System.Windows.Input.MouseEventHandler(this.menuAlchemySkills_MouseEnter);
            
            #line default
            #line hidden
            return;
            case 5:
            this.menuGeneralSkills = ((System.Windows.Controls.TextBlock)(target));
            
            #line 40 "..\..\MainWindow.xaml"
            this.menuGeneralSkills.MouseEnter += new System.Windows.Input.MouseEventHandler(this.menuGeneralSkills_MouseEnter);
            
            #line default
            #line hidden
            return;
            case 6:
            this.menuMutagens = ((System.Windows.Controls.TextBlock)(target));
            
            #line 49 "..\..\MainWindow.xaml"
            this.menuMutagens.MouseEnter += new System.Windows.Input.MouseEventHandler(this.menuMutagens_MouseEnter);
            
            #line default
            #line hidden
            return;
            case 7:
            this.menuMutations = ((System.Windows.Controls.TextBlock)(target));
            
            #line 58 "..\..\MainWindow.xaml"
            this.menuMutations.MouseEnter += new System.Windows.Input.MouseEventHandler(this.menuMutations_MouseEnter);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

