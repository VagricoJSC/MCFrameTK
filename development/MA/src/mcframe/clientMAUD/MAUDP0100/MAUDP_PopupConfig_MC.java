package mcframe.clientMAUD.MAUDP0100;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.beans.popup.MCPopupMenu;
import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_PopupConfig"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_PopupConfig_MC extends MAUDP_PopupConfig_MC_A implements MCAPListener {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_PopupConfig_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	public String _tgtTemplateId;

	// 更新対象のテンプレート名
	public String _tgtTemplateName;

	@Override
	protected void customPopup(MCPopupMenu menu, MCTable table) {
		super.customPopup(menu, table);
		if (table == null) {
			return ;
		}
		
		MCRootPanel panel = table.getBaseRootPanel();
		if (panel instanceof MAUDP_PanelBase) {
			MAUDP_PanelBase p = (MAUDP_PanelBase)panel;
			if (p.useExcelIn(table)) {
				table.getExcelInMenuItem().setVisible(true);
			}
			else {
				table.getExcelInMenuItem().setVisible(false);
			}
			if (p.useCsvIn(table)) {
				table.getCSVInMenuItem().setVisible(true);
			}
			else {
				table.getCSVInMenuItem().setVisible(false);
			}
		}
	}

}