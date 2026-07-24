package mcframe.clientMSBC.MSBCP0290;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import javax.swing.SwingUtilities;

import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Window;
import mcframe.clientCore.fxgantt.design.MCXAGDesignCalendarManager;
import mcframe.clientCore.fxgantt.design.MCXAGDesignMainControl;
import mcframe.clientCore.fxgantt.design.MCXAGDesignNode;
import mcframe.clientCore.fxgantt.design.MCXAGDesignPalette;
import mcframe.clientCore.fxgantt.design.MCXAGDesignVector;
import mcframe.clientCore.fxgantt.design.MCXAG_DBLabelRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBNodeRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBPropertyRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBTextRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBVectorRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBVectorSegmentsRow;
import mcframe.clientCore.fxgantt.design.MCXAGDesignMainTable;
import mcframe.clientCore.fxgantt.dialog.MCXAGDesignDetailNode;
import mcframe.clientCore.fxgantt.dialog.MCXAGDesignSettings;
import mcframe.clientCore.fxgantt.gantt.MCXAGGanttMainControl;
import mcframe.clientCore.fxgantt.graph.MCXAGDesignGraph;
import mcframe.clientCore.fxgantt.label.MCXAGDateLabel;
import mcframe.clientCore.fxgantt.label.MCXAGDateLabelColumn;
import mcframe.clientCore.fxgantt.label.MCXAGDesignVerticalTable;
import mcframe.clientCore.fxgantt.label.MCXAGVerticalLabel;
import mcframe.clientCore.fxgantt.locale.MCXAGUserMessage;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonMS.constant.MSC_ITM_ORD_LD_STS_TYP;
import mcframe.clientMSBC.MSBCP0290.RsltDispR;
import mcframe.clientMSBC.MSBCP0290.LocR;
import mcframe.clientMSBC.MSBCP0290.CalR;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


public class MSBCP_ItmOrdGanttChart_Gantt extends MSBCP_ItmOrdGanttChart_Gantt_MC {

	// コンストラクタ
	public MSBCP_ItmOrdGanttChart_Gantt(MSBCP_ItmOrdGanttChart aPanel) {
		super(aPanel);
	}
}
