package mcframe.clientMAUD.MAUDP0130;

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
import java.util.Map;

import mcframe.clientCore.resource.MCConfig;
import mcframe.clientCore.resource.MCConst;
import mcframe.clientFSBB.FSBBP0000.*;
import static mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_BizDatDLConfig"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_BizDatDLConfig_MC extends MAUDP_BizDatDLConfig_MC_A implements MCConfigPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** タイトルを管理するリソースキー */
	protected static String TITLE_KEY = "MA.MAUDP0130.title";

	/**	コメントを管理するリソースキー */
	protected static String COMMENT_KEY = "MA.MAUDP0130.comment";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_BizDatDLConfig_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		if (!execConfirm() || !checkConfig()) {
			return;
		}
		if (isStatusChanged()) {
			MCMessageList msgList = new MCMessageList();
			saveConfig(msgList);
			showEndMsg(msgList);
		}
		else {
			showNoDataChange();
		}
	}

	/**
	 * 更新処理を実行する場合にtrueが返ります。
	 */
	protected boolean execConfirm() {
		return confirm(msgUpdateConfirm()) == MCMessageBox.YES_OPTION;
	}

	/**
	 * 更新対象のコンテナのステータスが変更されている場合にtrueが返ります。
	 */
	protected boolean isStatusChanged() {
		for (MCContainer cont : getContainers()) {
			if (!isStatusNone(cont)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 登録処理の終了を示すメッセージを表示します。
	 */
	protected void showEndMsg(MCMessageList msgList) {
		dialog(msgUpdated());
	}

	/**
	 * 値の変更が無いことを示すメッセージを表示します。
	 */
	protected void showNoDataChange() {
		dialog(msgNoDataChange());
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		loadConfig();
	}

	/**
	 * 設定値を読み込みます。
	 */
	protected void loadConfig() {
		String typ = MCConfig.client.getString(
				CltDLInfo.DEF_FILE_TYP, CltDLInfo.getDefTyp());
		MCRadioButton btn = null;
		switch (nvl(typ, "").toLowerCase()) {
			default :
			case FileInfo.XLSX :
				btn = Def_file_typ_over_cap_XLSX;
				break;
			case FileInfo.CSV :
				btn = Def_file_typ_over_cap_CSV;
				break;
		}
		String cmd = btn.getActionCommand();
		setValueEx(Def_file_typ_over_cap_Group, cmd);
	}

	@Override
	public String getScreenName() {
		String title = MCConst.label.getLabel(MCConst.createKey(TITLE_KEY));
		return isNull(title) ? super.getScreenName() : title;
	}

	public void saveConfig(MCMessageList msgList) {
		MCRadioButton btn = Def_file_typ_over_cap_Group.getSelectedButton();
		MCConfig.client.setString(
				CltDLInfo.DEF_FILE_TYP, btn.getLabelByLocale());
		MCConfig.saveUser();
		loadConfig();
		statusClear();
	}

	@Override
	public boolean checkConfig() {
		return true;
	}

	@Override
	public MCList<MenuR> getMenu() {
		return null;
	}

	@Override
	public Map<String, MCRootPanel> getConfigPanels() {
		return null;
	}

	@Override
	public String getComment() {
		return MCConst.label.getLabel(MCConst.createKey(COMMENT_KEY));
	}

}