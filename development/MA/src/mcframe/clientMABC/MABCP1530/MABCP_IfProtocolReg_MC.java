package mcframe.clientMABC.MABCP1530;

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

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_IfProtocolReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_IfProtocolReg_MC extends MABCP_IfProtocolReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_IfProtocolReg_MC() {
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
	public MABCP_IfProtocolReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1530_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1530_Srch01Caller<P extends MABCP_IfProtocolReg, B extends MA_MABCL1530_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1530_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			// 検索時の消去対象として追加する
			addDownContainer(getRareaR());
		}

		@Override
		protected void clear() {
			super.clear();
			getRareaR().clear();
		}

		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL1530_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1530_Upd01Caller<P extends MABCP_IfProtocolReg, B extends MA_MABCL1530_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1530_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL1530_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1530_Del01Caller<P extends MABCP_IfProtocolReg, B extends MA_MABCL1530_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1530_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL1530_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABCL1530_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL1530_Del01();
	}

	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		Rarea_if_ctl_typ_nm.setLineWrap(true);
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		if (info.getEventIndex() < 0) return;
		setTestArea();
	}

	@Override
	public void doDtl_if_ctl_typ_LC(MCEventInfo info) {
		super.doDtl_if_ctl_typ_LC(info);

		if (info.getEventIndex() < 0) return;
		setTestArea();
	}

	/**
	 * テーブルのリストを全てクリア
	 */
	@Override
	protected void clearAll() {
		super.clearAll();
		getRareaR().clear();
	}

	/**
	 * テキストエリアの設定
	 */
	protected void setTestArea() {
		getRareaR().clear();
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			getRareaR().clear();
		}
		else {
			copy(getRareaR(), r, createMap_RareaR_DtlR());
		}
	}

	/**
	 * Dtl⇒Rarea
	 * 
	 * @return
	 */
	protected Map_RareaR_DtlR<RareaR, DtlR> createMap_RareaR_DtlR() {
		return new Map_RareaR_DtlR<RareaR, DtlR>();
	}

	public class Map_RareaR_DtlR<D extends RareaR, S extends DtlR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RareaR.$if_ctl_typ_nm, DtlR.$if_ctl_typ_nm);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_IF_PROTOCOL));
	}

	//--------------------リストロジック表示制御Start-----------------------
	@Override
	public MCList getDtl_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getDtl_if_proc_typ(row, info);
	}
	/**
	 * 表示するＩＦ処理区分を取得する
	 */
	protected MAC_IF_PROC_TYP[] getIfProcTyp(MCEventInfo info) {
		List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			String extSysTyp = r.ext_sys_typ();

			for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
				if (MAC_EXT_SYS_TYP.isEDI(extSysTyp) || MAC_EXT_SYS_TYP.isEDI_MCF(extSysTyp)) {
					if (ifProcTyp.is_edi()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isPLM(extSysTyp)) {
					if (ifProcTyp.is_plm()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isAC(extSysTyp)) {
					if (ifProcTyp.is_ac()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isSCM(extSysTyp) || MAC_EXT_SYS_TYP.isSCM_MD(extSysTyp)) {
					if (ifProcTyp.is_scm()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isFB(extSysTyp)) {
					if (ifProcTyp.is_fb()) {
						l.add(ifProcTyp);
					}
				}
				else if (MAC_EXT_SYS_TYP.isBI(extSysTyp)) {
					if (ifProcTyp.is_bi()) {
						l.add(ifProcTyp);
					}
				}
				else if (MAC_EXT_SYS_TYP.isAC_SAP(extSysTyp)) {
					if (ifProcTyp.is_sap()) {
						l.add(ifProcTyp);
					}
				}
				else if (MAC_EXT_SYS_TYP.isSCM_PCM(extSysTyp)) {
					if (ifProcTyp.is_pcm()) {
						l.add(ifProcTyp);
					}
				}
				if (!MAC_EXT_SYS_TYP.isBI(extSysTyp)) {
					if (ifProcTyp.is_all()) {
						l.add(ifProcTyp);
					}
				}
			}
		}
		return (MAC_IF_PROC_TYP[])l.toArray(new MAC_IF_PROC_TYP[0]);
	}

	//--------------------リストロジック表示制御End-----------------------

}