package mcframe.serverMABS.MABSL0910;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABS.MABSL5010.MABSL_SlsUpriService;
import mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR;
import static mcframe.serverMABS.MABSL0910.Query.*;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_SlsUpriChk"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_SlsUpriChk_MC extends MABSL_SlsUpriChk_MC_A{
	//FMCB CUSTOM START

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 販売単価の確認を行います。<br>
	 */
	public class Sprt01 extends MABSL_SlsUpriChk_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callSlsUpriService();
			srchCstSls();
			srchItmSls();
			srchStdSls();
		}
		
		protected void callSlsUpriService(){
			// 販売単価取得サービス
			MABSL_SlsUpriService.SlsUpri_Sprt01 slsService = MABSL_SlsUpriService.crtSlsUpri_Sprt01();
			// 上り電文
			setPegNo(up0());
			setAll(slsService.up0(), up0(), createMap_SlsUpri_Sprt01_DtlR_Sprt01_DtlR());
			
			slsService.exec();
			String[] downCols = new String[] {Sprt01_DtlR.$sls_upri, Sprt01_DtlR.$interim_flg};
			copyByPegNo(up0(), downCols, slsService.down0(), downCols);
			down0().setAll(up0());
			for (Sprt01_DtlR r : down0()) {
				if (isNull(r.sls_upri())) {
					r.err_flg(true);
				}
			}
		}
		
		// 得意先販売単価取得
		protected void srchCstSls() {
			executeQuery(down1(), MABSL0910_MAM_CST_SLS_UPRI_S01());

			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(down1());
		}
		
		// 品目販売単価
		protected void srchItmSls() {
			executeQuery(down2(), MABSL0910_MAM_ITM_SLS_UPRI_S01());

			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(down2());
		}
		
		// 標準販売単価
		protected void srchStdSls() {
			executeQuery(down3(), MABSL0910_MAM_STD_SLS_UPRI_S01());

			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(down3());
		}

	}
	protected Map_SlsUpri_Sprt01_DtlR_Sprt01_DtlR<SlsUpri_Sprt01_DtlR,Sprt01_DtlR> createMap_SlsUpri_Sprt01_DtlR_Sprt01_DtlR() {
		return new Map_SlsUpri_Sprt01_DtlR_Sprt01_DtlR<SlsUpri_Sprt01_DtlR, Sprt01_DtlR>();
	}

	public class Map_SlsUpri_Sprt01_DtlR_Sprt01_DtlR<D extends SlsUpri_Sprt01_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$dlv_cd, Sprt01_DtlR.$dlv_cd);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$dest_cd1, Sprt01_DtlR.$dest_cd1);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$dest_cd2, Sprt01_DtlR.$dest_cd2);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$dest_cd3, Sprt01_DtlR.$dest_cd3);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$unit_cd, Sprt01_DtlR.$unit_cd);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$qty, Sprt01_DtlR.$qty);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$cur_cd, Sprt01_DtlR.$cur_cd);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$wg_cd, Sprt01_DtlR.$wg_cd);
			addColumnPathMap(SlsUpri_Sprt01_DtlR.$dt, Sprt01_DtlR.$dt);
		}
		
		@Override
		public void valueCopy(D dest, S src){
			if (isNull(src.cst_cd())) {
				dest.cst_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.cst_cd(src.cst_cd());
			}
			dest.sls_upri_flg(true);
			dest.std_sls_upri_flg(false);
			dest.std_upri_flg(false);
		}
	}

	//FMCB CUSTOM END
}