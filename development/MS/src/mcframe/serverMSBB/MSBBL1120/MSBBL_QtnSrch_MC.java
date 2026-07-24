package mcframe.serverMSBB.MSBBL1120;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMSBB.MSBBL1120.Query.*;
import mcframe.serverMSBB.MSBBL6040.MSBBL_QtnPrntService;
import mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_QtnSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_QtnSrch_MC extends MSBBL_QtnSrch_MC_A{
	//FMCB CUSTOM START
	protected static final String SRCH_MODE_DTL = "DTL";
	protected static final String SRCH_MODE_HDR = "HDR";
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 見積を検索する<br>
	 */
	public class Srch01 extends MSBBL_QtnSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = null;
			
			up0().setDateNE("today", getToday());
			
			// ヘッダ
			if (isSame(up0().disp(), SRCH_MODE_HDR)) {
				sql  = MSBBL1120_MST_QTN_S01();
			}
			// 明細
			else if (isSame(up0().disp(), SRCH_MODE_DTL)) {
				sql = MSBBL1120_MST_QTN_D_S01();
			}
			
			searchForDL(sql , up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			if (isSame(up0().disp(), SRCH_MODE_DTL)) {
				MCNumber baseAmtDecPlace = getBaseCur().amt_dec_place();
				MCNumber baseUpriDecPlace = getBaseCur().upri_dec_place();
				
				String rndMode = getCo().xrate_rnd_typ();
				
				for (int i = 0; i < down0().size(); i++) {
					Srch01_RsltR r = down0().get(i);
					
					r.base_cur_cd(getBaseCur().cur_cd());
					r.base_cur_nm(getBaseCur().cur_nm());
					r.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
					r.base_cur_upri_dec_place(getBaseCur().upri_dec_place());
					
					r.base_cur_std_upri(convToBaseCur(r.trd_cur_std_sls_upri(), r.xrate(), baseUpriDecPlace, rndMode));
					r.base_cur_std_amt(convToBaseCur(r.trd_cur_std_sls_amt(), r.xrate(), baseAmtDecPlace, rndMode));
					r.base_cur_std_tax_amt(convToBaseCur(r.trd_cur_std_sls_tax_amt(), r.xrate(), baseAmtDecPlace, rndMode));
					r.base_cur_std_inc_tax_amt(convToBaseCur(r.trd_cur_std_sls_inc_tax_amt(), r.xrate(), baseAmtDecPlace, rndMode));
					
					r.base_cur_upri(convToBaseCur(r.trd_cur_upri(), r.xrate(), baseUpriDecPlace, rndMode));
					r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), r.xrate(), baseAmtDecPlace, rndMode));
					r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), baseAmtDecPlace, rndMode));
					r.base_cur_inc_tax_amt(convToBaseCur(r.trd_cur_inc_tax_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				}
			}
		}
	}
	
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 見積書を発行する<br>
	 */
	public class Prnt01 extends MSBBL_QtnSrch_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MSBBL_QtnPrntService.Qtn_Prnt01 ope = MSBBL_QtnPrntService.crtQtn_Prnt01();
			setAll(ope.up0(), up0(), createMap_Qtn_Prnt01_HdrR_Prnt01_RsltR());
			ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();
			
			MCIndexKey ik = ope.down0().createIndex(Qtn_Prnt01_HdrR.$qtn_no, Qtn_Prnt01_HdrR.$qtn_rev, Qtn_Prnt01_HdrR.$qtn_prnt_seq);
			for (Prnt01_RsltR up : up0()) {
				Qtn_Prnt01_HdrR down = ope.down0().getFirst(ik, up.qtn_no(), up.qtn_rev(), up.qtn_prnt_seq());
				if (down == null) {
					continue;
				}
				else if (down.err_flg()) {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			down0().setAll(up0());
		}
		
		protected Map_Qtn_Prnt01_HdrR_Prnt01_RsltR<Qtn_Prnt01_HdrR,Prnt01_RsltR> createMap_Qtn_Prnt01_HdrR_Prnt01_RsltR() {
			return new Map_Qtn_Prnt01_HdrR_Prnt01_RsltR<Qtn_Prnt01_HdrR, Prnt01_RsltR>();
		}

		public class Map_Qtn_Prnt01_HdrR_Prnt01_RsltR<D extends Qtn_Prnt01_HdrR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Qtn_Prnt01_HdrR.$qtn_no, Prnt01_RsltR.$qtn_no);
				addColumnPathMap(Qtn_Prnt01_HdrR.$qtn_rev, Prnt01_RsltR.$qtn_rev);
				addColumnPathMap(Qtn_Prnt01_HdrR.$qtn_prnt_seq, Prnt01_RsltR.$qtn_prnt_seq);

			}
		}
	}

	//FMCB CUSTOM END
}