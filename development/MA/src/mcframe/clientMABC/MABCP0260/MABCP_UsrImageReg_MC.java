package mcframe.clientMABC.MABCP0260;

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
import mcframe.clientCore.sys.MCSys;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_UsrImageReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_UsrImageReg_MC extends MABCP_UsrImageReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _IMAGE_HEIGHT = "th_image_height";
	protected String _IMAGE_WIDTH = "th_image_width";
	protected int _DEFAULT_ROW_HEIGHT = 21;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_UsrImageReg_MC() {
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
	public MABCP_UsrImageReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABCL0260_Srch01();
	}
	/**
	 * [MA_MABCL0260_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0260_Srch01Caller<P extends MABCP_UsrImageReg, B extends MA_MABCL0260_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0260_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void adjustList() {
			columnDtl_th_image.setAdjustWidth(false);
			super.adjustList();
			
			Integer h = getImageWH(_IMAGE_HEIGHT);
			Integer w = getImageWH(_IMAGE_WIDTH);
			
			if (!isNull(h) && !isNull(w)) {
				DtlTable.setMCRowHeight(h + 10);
				columnDtl_th_image.setWidthForAdjustWidth(w + 10);
				columnDtl_th_image.setImageSize(w, h);
			}
			else {
				DtlTable.setMCRowHeight(_DEFAULT_ROW_HEIGHT);
			}
		}
		
		/**サムネイル画像の高さ・横幅を取得します。*/
		protected Integer getImageWH(String _wh) {
			String key = getDispString(_wh);
			Integer imageWH = new Integer(key);
			return imageWH;
		}
	}

	/**
	 * [MA_MABCL0260_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0260_Upd01Caller<P extends MABCP_UsrImageReg, B extends MA_MABCL0260_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0260_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		public MCMessage msgNoDataChange() {
			return new MCMessage(FXBAP0011);
		}
	}


	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABCL0260_Upd01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_usr_cd, MCSys.user.ID());
		addDoBehind(Cnd_srch);
	}

	@Override
	protected void setStatusByOpe() {
		// 何もなし
	}

}