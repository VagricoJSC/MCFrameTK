package mcframe.clientMABC.MABCP0240;

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
 * 画面"MABCP_UsrReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_UsrReg_MC extends MABCP_UsrReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _IMAGE_HEIGHT = "th_image_height";
	protected String _IMAGE_WIDTH = "th_image_width";
	protected int _DEFAULT_ROW_HEIGHT = 21;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_UsrReg_MC() {
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
	public MABCP_UsrReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0240_Srch01();
	}
	/**
	 * [MA_MABCL0240_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0240_Srch01Caller<P extends MABCP_UsrReg, B extends MA_MABCL0240_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0240_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void adjustList() {
			columnDtl_th_image.setAdjustWidth(false);
			super.adjustList();
			
			if(bridge.up0().th_image_flg()) {
				Integer h = getImageWH(_IMAGE_HEIGHT);
				Integer w = getImageWH(_IMAGE_WIDTH);
				
				if (!isNull(h) && !isNull(w)) {
					DtlTable.setMCRowHeight(h + 10);
					columnDtl_th_image.setWidthForAdjustWidth(w + 10);
					columnDtl_th_image.setImageSize(w, h);
				}
			}
			else {
				int ratio = DtlTable.getRatio();
				DtlTable.setMCRowHeight(MCBeansUtil.adjust(_DEFAULT_ROW_HEIGHT, 100, ratio));
			}
		}

		/**サムネイル画像の高さ・横幅を取得します。*/
		protected Integer getImageWH(String _wh) {
			String key = getDispString(_wh);
			Integer imageWH = new Integer(key);
			return imageWH;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
			setThimageFlg();
		}
	}

	/**
	 * [MA_MABCL0240_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0240_Upd01Caller<P extends MABCP_UsrReg, B extends MA_MABCL0240_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0240_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0240_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0240_Del01Caller<P extends MABCP_UsrReg, B extends MA_MABCL0240_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0240_Del01Caller(P p, B b) {
			super(p, b);
		}
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
	 * Panel[LclBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_select_all(MCEventInfo info) {
		doSelectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtn_radd(MCEventInfo info) {
		insertRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtn_rdel(MCEventInfo info) {
		deleteRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtn_rcopy(MCEventInfo info) {
		copyRow(LclTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0240_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0240_Del01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_USR));
	}
	
	
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setThimageFlg();
	}

	/**
	 * 一覧にサムネイル画像のModeをセット。
	 */
	protected void setThimageFlg() {
		if (!getCndR().th_image_flg()) {
			columnDtl_th_image.setMode(MCMode.INVISIBLE);
		}
	}

}