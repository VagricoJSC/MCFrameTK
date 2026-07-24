package mcframe.clientMGBD.MGBDP0020;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP5030.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_CalcItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_CalcItmReg_MC extends MGBDP_CalcItmReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	IfMGBDP0020_T1_MGBDP0010 _calcpanel = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CalcItmReg_MC() {
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
	public MGBDP_CalcItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0020_Srch01Caller<P extends MGBDP_CalcItmReg, B extends MG_MGBDL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Cnd_calc_grp_cd, Cnd_term));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setINSStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	/**
	 * [MG_MGBDL0020_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0020_Ins01Caller<P extends MGBDP_CalcItmReg, B extends MG_MGBDL0020_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0020_Ins01Caller(P p, B b) {
			super(p, b);
		}
				
		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			panel.statusClear();
			_calcpanel.calc();
			requestCloseWindow();
		}

		@Override
		protected void showMsg() {

		}

	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0020_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMG_MGBDL0020_Ins01();
	}
	public void screenClearBody() {
		CndR r = getCndR().clone();
		super.screenClearBody();
		setValueEx(Cnd_calc_grp_cd, r.calc_grp_cd());
		setValueEx(Cnd_term, r.term());
		
	};

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		Ctrl_ctrl_PPanel.expand(false);
		DtlTable.selectLeftmostColumn(0);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}
	
	/**
	* 他画面から呼び出された場合の初期化を実装します。<br>
	* <P>
	* <li>
	* 起動タイプ：T1 （参照）<br>
	* バインド値 ＜必須＞<br>
	* <table border = 1>
	* <tr><th>カラム名</th><th>型</th><th>備考</th></tr>
	* <tr><td>calc_grp_cd</td><td>String</td><td>必須</td></tr> 
	* <tr><td>term</td><td>MCDate</td><td>必須</td></tr>
	* </table> <br>
	* 
	* その他引数 ＜必須＞<br>
	* <table border = 1>
	* <tr><th>Index</th><th>型</th><th>備考</th></tr>
	* <tr><td>0</td><td>mcframe.clientMGBD.MGBDP0010.CndR</td><td>必須:計算実行用の条件</td></tr> 
	* </table> <br>
	* </li>
	* </P>
	* 
	* @param openTyp 起動タイプ
	* @param bind バインド値
	* @param args その他の引数
	*/
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		if (isSame(T1, openTyp)) {
			valueInit();
			setValueEx(Cnd_calc_grp_cd, bind.getStringNE("calc_grp_cd"));
			if (isNull(getCndR().calc_grp_cd())) {
				return;
			}
			Cnd_term.setValue(bind.getDateNE("term"));
			
			_calcpanel = (IfMGBDP0020_T1_MGBDP0010) getParentPanel();
		}
	}
	
	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

}