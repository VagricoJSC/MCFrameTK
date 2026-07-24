package mcframe.serverMGBG.MGBGL5050;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.HashMap;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.login.MCUserAuthAgent;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverPF.dbc.*;
import mcframe.serverPFBZ.PFBZL9030.*;
import mcframe.commonMGBG.MGBGR5050.*;
import mcframe.commonCore.login.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_NxPlnAlcRecvIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_NxPlnAlcRecvIf_MC extends MGBGL_NxPlnAlcRecvIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * NX予算パターンテーブルの予算パターン
	 */
	protected static final String _YSN_PTN_NX_YSN_PTN = "nx_ysn_ptn";

	/**
	 * NX予算パターンテーブルの計算カテゴリCD
	 */
	protected static final String _YSN_PTN_CAL_CTG_CD = "calc_ctg_cd";

	/**
	 * NXカレンダテーブルの会計期
	 */
	protected static final String _CAL_NX_FY = "nx_fy";

	/**
	 * NXカレンダテーブルの会計月度
	 */
	protected static final String _CAL_NX_GTD = "nx_gtd";

	/**
	 * NXカレンダテーブルの年月
	 */
	protected static final String _CAL_YM = "ym";
	
	/**
	 * NxPlnAlcIf_Conv01オペレーション.<p>
	 *
	 */
	public class NxPlnAlcIf_Conv01 extends MGBGL_NxPlnAlcRecvIf_MC_A.NxPlnAlcIf_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void crtRptSet() {
			if (!MCUserAuthAgent.usableProduct(MCAuth.PROD_NXLINK)) {
				return;
			}
			
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MGT_PLN_ALC_AMT_RCV_R.class);
			_IfRptSet.setReportSet(MGBGR_NxPlnAlcPrnt.create());
			_IfRptSet.setRowMapper(new MGT_PLN_ALC_AMT_RCV_R_DtlR());
			_IfRptSet.setReqColumns(getReqColumns());
			_IfRptSet.setNotImpCondDiff(getNotImpCondDiff());
			_IfRptSet.setNotImpCondSame(getNotImpCondSame());
		}

		/**
		 * 予算ファイルの必須項目を返します
		 * @return
		 */
		protected String[] getReqColumns() {
			String[] res = {
					DtlR.$fy, DtlR.$gtd, DtlR.$ysn_kin
			};
			return res;
		}
		
		/**
		 * IFテーブルに取り込まないデータの条件を返します
		 * @return
		 */
		protected HashMap<String, String> getNotImpCondDiff() {
			HashMap<String, String> map = new HashMap<>();
			map.put(DtlR.$cur_code, getCo().base_cur_cd());
			return map;
		}
		
		/**
		 * IFテーブルに取り込まないデータの条件を返します
		 * @return
		 */
		protected HashMap<String, String> getNotImpCondSame() {
			HashMap<String, String> map = new HashMap<>();
			map.put(MGT_ACT_ALC_AMT_RCV_R.$calc_ctg_cd, "");
			return map;
		}

		public class MGT_PLN_ALC_AMT_RCV_R_DtlR<D extends MGT_PLN_ALC_AMT_RCV_R, S extends DtlR, W extends PFT_SDRV_IF_R> extends MAUCC_RowMapperWith<D, S, W> {

			protected W _ifR;

			@Override
			public void setWith(W ifR) {
				_ifR = ifR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$ac_cd, DtlR.$kmk_code);
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$sub_ac_cd, DtlR.$hkm_code);
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$dpt_cd, DtlR.$bmn_code);
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$amt, DtlR.$ysn_kin);
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$if_sub_char1, DtlR.$fc1);
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$if_sub_char2, DtlR.$fc2);
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$if_sub_char3, DtlR.$fc3);
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$if_sub_char4, DtlR.$fc4);
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$if_sub_char5, DtlR.$prj_code);
				addColumnPathMap(MGT_PLN_ALC_AMT_RCV_R.$if_sub_num1, DtlR.$ysn_kin_hif);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.data_lno(getSequence(mcframe.commonMG.constant.MGC_NUM_SYS_TYP.ACT_ALC_IF_DATA_LNO.value()));
				dest.data_no(_ifR.data_no());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.imp_flg(true);

				MCRow ysnPtnR = getYsnPtnR(src.ysn_ptn_code());
				if (ysnPtnR != null) {
					String calcCtgCd = ysnPtnR.getString(_YSN_PTN_CAL_CTG_CD);
					src.addStringColumn(MGT_ACT_ALC_AMT_RCV_R.$calc_ctg_cd, calcCtgCd);
					dest.calc_ctg_cd(calcCtgCd);
				}
				else {
					src.addStringColumn(MGT_ACT_ALC_AMT_RCV_R.$calc_ctg_cd, "");
				}

				MCRow calR = getCalR(src.fy(), src.gtd());
				if (calR != null) {
					dest.ym(calR.getDate(_CAL_YM));
				}
				if (isSame(dest.amt(), MCNumber.ZERO)) {
					//取込対象外にするため、計算カテゴリＣＤに空文字を設定する
					src.addStringColumn(MGT_ACT_ALC_AMT_RCV_R.$calc_ctg_cd, "");
				}
			}
		}
	}

	protected static final Class<MGBGL_NxPlnAlcRecvIf> CLAZZ = MGBGL_NxPlnAlcRecvIf.class;

	MCList<MCRow> _calL;

	MCIndexKey _calKey;

	protected void initCalCache() {
		MCList<MCRow> res = MCList.create(MCRow.class);
		MGVT_PAT_CAL_R t = MGVT_PAT_CAL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		
		builder.setSelect(t.nx_fy);
		builder.addSelect(t.nx_gtd);
		builder.addSelect(t.ym);
		dbSelect("MGBGL5050_MGVT_PAT_CAL_S01", res, builder);
		
		object(CLAZZ)._calL = res;
		object(CLAZZ)._calKey = object(CLAZZ)._calL.createIndex(_CAL_NX_FY, _CAL_NX_GTD);
	}

	protected MCRow getCalR(MCNumber nxFy, MCNumber nxGtd) {
		if (object(CLAZZ)._calL == null) {
			initCalCache();
		}
		return object(CLAZZ)._calL.getFirst(object(CLAZZ)._calKey, nxFy, nxGtd);
	}

	MCList<MCRow> _ysnPtnL;

	MCIndexKey _ysnPtnKey;

	protected void initYsnPtnCache() {
		MCList<MCRow> res = MCList.create(MCRow.class);
		MGVT_PAT_YSN_PTN_R t = MGVT_PAT_YSN_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		
		builder.setSelect(t.nx_ysn_ptn);
		builder.addSelect(t.calc_ctg_cd);
		dbSelect("MGBGL5050_MGVT_PAT_YSN_PTN_S01", res, builder);
		
		object(CLAZZ)._ysnPtnL = res;
		object(CLAZZ)._ysnPtnKey = object(CLAZZ)._ysnPtnL.createIndex(_YSN_PTN_NX_YSN_PTN);
	}

	protected MCRow getYsnPtnR(String nxYsnPtn) {
		if (object(CLAZZ)._ysnPtnL == null) {
			initYsnPtnCache();
		}
		return object(CLAZZ)._ysnPtnL.getFirst(object(CLAZZ)._ysnPtnKey, nxYsnPtn);
	}

	//FMCB CUSTOM END
}