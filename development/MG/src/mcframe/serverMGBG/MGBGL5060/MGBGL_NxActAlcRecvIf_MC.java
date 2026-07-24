package mcframe.serverMGBG.MGBGL5060;

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
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverPF.dbc.*;
import mcframe.serverPFBZ.PFBZL9030.*;
import mcframe.commonMGBG.MGBGR5060.*;
import mcframe.commonMG.constant.*;
import mcframe.commonCore.login.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_NxActAlcRecvIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_NxActAlcRecvIf_MC extends MGBGL_NxActAlcRecvIf_MC_A{
	//FMCB CUSTOM START
	
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
	 * NXパラメータテーブルのパラメータキー
	 */
	protected static final String _NX_PARM_NX_PARM_KEY = "nx_parm_key";
	
	/**
	 * NXパラメータテーブルのパラメータ値
	 */
	protected static final String _NX_PARM_NX_PARM_VAL = "nx_parm_val";
	
	/**
	 * 制度遡及区分=J:日本に対応するパラメータキー
	 */
	protected static final String _NX_PARM_NX_SEIDO_J = "NX_SEIDO_J";
	
	/**
	 * 制度遡及区分=1:遡及に対応するパラメータキー
	 */
	protected static final String _NX_PARM_NX_SEIDO_1 = "NX_SEIDO_1";
	
	/**
	 * 制度遡及区分=I:IFRSに対応するパラメータキー
	 */
	protected static final String _NX_PARM_NX_SEIDO_I = "NX_SEIDO_I";
	
	/**
	 * 制度遡及区分=2:遡及２に対応するパラメータキー
	 */
	protected static final String _NX_PARM_NX_SEIDO_2 = "NX_SEIDO_2";
	
	/**
	 * 制度遡及区分=C:共通に対応するパラメータキー
	 */
	protected static final String _NX_PARM_NX_SEIDO_C = "NX_SEIDO_C";
	
	/**
	 * 制度遡及区分=3:遡及３に対応するパラメータキー
	 */
	protected static final String _NX_PARM_NX_SEIDO_3 = "NX_SEIDO_3";
	
	/**
	 * 制度遡及区分=J:日本の値
	 */
	protected static final String _SEIDO_SOKYU_KBN_JAPAN = "J";
	
	/**
	 * 制度遡及区分=1:遡及の値
	 */
	protected static final String _SEIDO_SOKYU_KBN_SOKYU = "1";
	
	/**
	 * 制度遡及区分=I:IFRSの値
	 */
	protected static final String _SEIDO_SOKYU_KBN_IFRS = "I";
	
	/**
	 * 制度遡及区分=2:遡及２の値
	 */
	protected static final String _SEIDO_SOKYU_KBN_SOKYU2 = "2";
	
	/**
	 * 制度遡及区分=C:共通の値
	 */
	protected static final String _SEIDO_SOKYU_KBN_COMMON = "C";
	
	/**
	 * 制度遡及区分=3:遡及３の値
	 */
	protected static final String _SEIDO_SOKYU_KBN_SOKYU3= "3";

	/**
	 * NxActAlcIf_Conv01オペレーション.<p>
	 *
	 */
	public class NxActAlcIf_Conv01 extends MGBGL_NxActAlcRecvIf_MC_A.NxActAlcIf_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void crtRptSet() {
			if (!MCUserAuthAgent.usableProduct(MCAuth.PROD_NXLINK)) {
				return;
			}
			
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MGT_ACT_ALC_AMT_RCV_R.class);
			_IfRptSet.setReportSet(MGBGR_NxActAlcPrnt.create());
			_IfRptSet.setRowMapper(new MGT_ACT_ALC_AMT_RCV_R_DtlR());
			_IfRptSet.setReqColumns(getReqColumns());
			_IfRptSet.setNotImpCondSame(getNotImpCondSame());
		}

		/**
		 * 残高ファイルの必須項目を返します
		 * @return
		 */
		protected String[] getReqColumns() {
			String[] res = {
					DtlR.$fy, DtlR.$gtd, DtlR.$kmk_code
			};
			return res;
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

		public class MGT_ACT_ALC_AMT_RCV_R_DtlR<D extends MGT_ACT_ALC_AMT_RCV_R, S extends DtlR, W extends PFT_SDRV_IF_R> extends MAUCC_RowMapperWith<D, S, W> {

			protected W _ifR;

			@Override
			public void setWith(W ifR) {
				_ifR = ifR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$ac_cd, DtlR.$kmk_code);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$sub_ac_cd, DtlR.$hkm_code);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$dpt_cd, DtlR.$bmn_code);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_char1, DtlR.$fc1);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_char2, DtlR.$fc2);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_char3, DtlR.$fc3);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_char4, DtlR.$fc4);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_char5, DtlR.$prj_code);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_num1, DtlR.$dr_zan);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_num2, DtlR.$cr_zan);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_num3, DtlR.$dr_zan_hif);
				addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_num4, DtlR.$cr_zan_hif);
			}

			@Override
			protected void valueCopy(D dest, S src) {

				MCRow calR = getCalR(src.fy(), src.gtd());
				if (calR != null) {
					//年月が取得できない場合は、バッチログ確認で参照したときSQL実行エラーと表示される
					dest.ym(calR.getDate(_CAL_YM));
				}

				MCRow nxParmR = getNxParmR(convertSeidoSokyuKbn(src.seido_sokyu_kbn()));
				if (nxParmR != null) {
					String nxParmVal = nxParmR.getString(_NX_PARM_NX_PARM_VAL);
					src.addStringColumn(MGT_ACT_ALC_AMT_RCV_R.$calc_ctg_cd, nxParmVal);
					dest.calc_ctg_cd(nxParmVal);
				}
				else {
					src.addStringColumn(MGT_ACT_ALC_AMT_RCV_R.$calc_ctg_cd, "");
				}

				dest.amt(calcAmt(src.kmk_code(), src.dr_zan(), src.cr_zan(), src.dr_zan_hif(), src.cr_zan_hif()));
				dest.data_lno(getSequence(MGC_NUM_SYS_TYP.ACT_ALC_IF_DATA_LNO.value()));
				dest.data_no(_ifR.data_no());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.ext_sys_cd(null);
				dest.ext_data_no(null);
				dest.ext_data_lno(null);
				dest.data_make_dt(null);
				dest.imp_flg(true);
				if (isSame(src.gtd(), MCNumber.ZERO) || isNull(dest.amt()) || isSame(dest.amt(), MCNumber.ZERO)) {
					//取込対象外にするため、計算カテゴリＣＤに空文字を設定する
					src.addStringColumn(MGT_ACT_ALC_AMT_RCV_R.$calc_ctg_cd, "");
				}
			}
		}

		/**
		 * NXの制度遡及区分からmcのNXパラメータキーへ変換します
		 * 
		 * @param seidoSokyuKbn
		 * @return
		 */
		protected String convertSeidoSokyuKbn(String seidoSokyuKbn) {
			if (seidoSokyuKbn.equals(_SEIDO_SOKYU_KBN_JAPAN)) {
				return _NX_PARM_NX_SEIDO_J;
			}
			else if (seidoSokyuKbn.equals(_SEIDO_SOKYU_KBN_SOKYU)) {
				return _NX_PARM_NX_SEIDO_1;
			}
			else if (seidoSokyuKbn.equals(_SEIDO_SOKYU_KBN_IFRS)) {
				return _NX_PARM_NX_SEIDO_I;
			}
			else if (seidoSokyuKbn.equals(_SEIDO_SOKYU_KBN_SOKYU2)) {
				return _NX_PARM_NX_SEIDO_2;
			}
			else if (seidoSokyuKbn.equals(_SEIDO_SOKYU_KBN_COMMON)) {
				return _NX_PARM_NX_SEIDO_C;
			}
			else if (seidoSokyuKbn.equals(_SEIDO_SOKYU_KBN_SOKYU3)) {
				return _NX_PARM_NX_SEIDO_3;
			}
			else {
				return "";
			}
		}
		
		/**
		 * 金額を計算して返します
		 * 
		 * @param kmkCode 科目コード
		 * @param drZan 借方残高（発生用）
		 * @param crZan 貸方残高（発生用）
		 * @param drZanHif 借方残高（配賦用）
		 * @param crZanHif 貸方残高（配賦用）
		 * @return 金額
		 */
		protected MCNumber calcAmt(String kmkCode, MCNumber drZan, MCNumber crZan, MCNumber drZanHif, MCNumber crZanHif) {
			MAM_ACCOUNT_R ac = getAccountR(kmkCode);

			//mc7の勘定科目CDとNX科目コードが一致しない場合は金額の計算ができない
			//バッチログ確認で参照したときにSQL実行エラーと表示される
			if (ac == null) return null;

			if (MAC_DC_TYP.isDR(ac.dc_typ())) {
				return drZan.subtract(crZan).add(drZanHif).subtract(crZanHif);
			}
			else if (MAC_DC_TYP.isCR(ac.dc_typ())) {
				return crZan.subtract(drZan).add(crZanHif).subtract(drZanHif);
			}

			return null;
		}
	}

	protected static final Class<MGBGL_NxActAlcRecvIf> CLAZZ = MGBGL_NxActAlcRecvIf.class;

	MCList<MCRow> _nxParmL;

	MCIndexKey _nxParmKey;

	protected void initNxParmCache() {
		MCList<MCRow> res = MCList.create(MCRow.class);
		MGVT_PAT_NX_PARM_R t = MGVT_PAT_NX_PARM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		
		builder.setSelect(t.nx_parm_key);
		builder.addSelect(t.nx_parm_val);
		dbSelect("MGBGL5060_MGVT_PAT_NX_PARM_S01", res, builder);
		
		object(CLAZZ)._nxParmL = res;
		object(CLAZZ)._nxParmKey = object(CLAZZ)._nxParmL.createIndex(_NX_PARM_NX_PARM_KEY);
	}

	protected MCRow getNxParmR(String nxParmKey) {
		if (object(CLAZZ)._nxParmL == null) {
			initNxParmCache();
		}
		return object(CLAZZ)._nxParmL.getFirst(object(CLAZZ)._nxParmKey, nxParmKey);
	}
	
	MCList<MCRow> _calL;

	MCIndexKey _calKey;

	protected void initCalCache() {
		MCList<MCRow> res = MCList.create(MCRow.class);
		MGVT_PAT_CAL_R t = MGVT_PAT_CAL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		
		builder.setSelect(t.nx_fy);
		builder.addSelect(t.nx_gtd);
		builder.addSelect(t.ym);
		dbSelect("MGBGL5060_MGVT_PAT_CAL_S01", res, builder);
		
		object(CLAZZ)._calL = res;
		object(CLAZZ)._calKey = object(CLAZZ)._calL.createIndex(_CAL_NX_FY, _CAL_NX_GTD);
	}

	protected MCRow getCalR(MCNumber nxFy, MCNumber nxGtd) {
		if (object(CLAZZ)._calL == null) {
			initCalCache();
		}
		return object(CLAZZ)._calL.getFirst(object(CLAZZ)._calKey, nxFy, nxGtd);
	}

	MCList<MAM_ACCOUNT_R> _accountL;

	MCIndexKey _accountKey;
	
	protected void initAccountCache() {
		MCList<MAM_ACCOUNT_R> dbc = MCList.create(MAM_ACCOUNT_R.class);
		MAM_ACCOUNT_R t = MAM_ACCOUNT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setSelect(t.ac_cd, t.dc_typ);
		dbSelect("MGBGL5060_MAM_ACCOUNT_S01", dbc, builder);
		
		object(CLAZZ)._accountL = dbc;
		object(CLAZZ)._accountKey = object(CLAZZ)._accountL.createIndex(MAM_ACCOUNT_R.$ac_cd);
	}
	
	protected MAM_ACCOUNT_R getAccountR(String acCd) {
		if (object(CLAZZ)._accountL == null) {
			initAccountCache();
		}
		return object(CLAZZ)._accountL.getFirst(object(CLAZZ)._accountKey, acCd);
	}

	//FMCB CUSTOM END
}