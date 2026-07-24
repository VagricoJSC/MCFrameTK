package mcframe.clientMBBC.MBBCP0030;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBCP_FileSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBCP_FileSrch_MC extends MBBCP_FileSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	MCRow _tgtRow;
	String _fileNm;
	String _filePath;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBCP_FileSrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBCP_FileSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBCL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBCL0030_Srch01Caller<P extends MBBCP_FileSrch, B extends MB_MBBCL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBCL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			if (!getRsltL().isEmpty()) {
				getCndR().file_path(getRsltL().get(0).file_path());
			}
		}

		@Override
		protected void showNoDownDataMsg() {
			// 何もしない
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setBtnMode();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setBtnMode();
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		String path = getCndR().file_path();
		path =path.substring(0, path.length()-1);
		int i = path.lastIndexOf("/");
		if (i >= 0) {
			getCndR().file_path(getCndR().file_path().substring(0, i+1));
			callMB_MBBCL0030_Srch01();
		}
	}

	/**
	 * Panel[Btn]のボタン[select]の押下時の処理
	 */
	@Override
	public void doBtn_select(MCEventInfo info) {
		RsltR r= getRsltL().getFirst(RsltR.$check, true);
		if (null == r && !(getCndR().folder_select_mode_flg() && getRsltL().isEmpty())) {
			dialog(msgNoSelectedRow());
			return;
		}

		if (!isNull(_tgtRow)) {
			if (getCndR().folder_select_mode_flg()) {
				if (getRsltL().isEmpty()) {
					_tgtRow.setValueNE(_filePath, getCndR().file_path());
				}
				else {
					_tgtRow.setValueNE(_filePath, getCndR().file_path() + r.file_nm() + "/");
				}
			}
			else {
				_tgtRow.setValueNE(_filePath, r.file_path());
				_tgtRow.setValueNE(_fileNm, r.file_nm());
			}
		}
		requestCloseWindow();
	}

	/**
	 * Panel[Rslt]のボタン[open_file]の押下時の処理
	 */
	@Override
	public void doRslt_open_file(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (isSame(r.typ_nm(), "folder")) {
			getCndR().file_path(getCndR().file_path() + r.file_nm() + "/");
			callMB_MBBCL0030_Srch01();
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info){
		super.doRslt_check_NC(info);

		RsltR er = getRsltL().get(info.getEventIndex());
		if (er.check()) {
			getRsltL().forEach(dr -> {
				if (dr != er) {
					dr.check(false);
				}
			});
		}
		statusClear();
		setBtnMode();
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			doRslt_open_file(info);
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltTableCellConfig());
	}

	/**
	 * RsltTable用のCellConfigを作成します。
	 */
	protected MCCellConfig createRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}

	/**
	 * RsltTable用のCellConfig
	 */
	public class RsltTableCellConfig extends MAUDP_CellConfig {

		@SuppressWarnings("rawtypes")
		@Override
		public MCMode getPriorMode(	int index, MCColumnConfig column, MCTable table) {
			RsltR row = RsltTable.getRow(index);
			
			if (column == columnRslt_open_file) {
				if (isSame(row.typ_nm(), "document")) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnRslt_check) {
				if (!getCndR().folder_select_mode_flg() && isSame(row.typ_nm(), "folder")) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}

	}

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		if (isSame(T1, openTyp)) {
			valueInit();
			setValueEx(Cnd_file_path, bind.getStringNE("file_path"));
			setValueEx(Cnd_folder_select_mode_flg, bind.getBooleanNE("folder_select_mode_flg"));
			setValueEx(Cnd_ext_sys_cd, bind.getStringNE("ext_sys_cd"));
			callMB_MBBCL0030_Srch01();

			if (args == null || args.length < 3) {
				return ;
			}
			_tgtRow = (MCRow)args[0];
			_filePath = (String)args[1];
			_fileNm = (String)args[2];
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setBtnMode();
	}
	protected void setBtnMode() {
		RsltR r= getRsltL().getFirst(RsltR.$check, true);
		if (!isNull(r) || getCndR().folder_select_mode_flg() && getRsltL().isEmpty()) {
			setDefaultMode(Btn_select);
		}
		else {
			Btn_select.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void screenClearBody() {
		// 何もしない
	}

}