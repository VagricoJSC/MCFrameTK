package mcframe.serverMGBD.MGBDL0250;

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
import java.util.ArrayList;
import java.util.Arrays;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueJoin;
import static mcframe.serverMGBD.MGBDL0250.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_PreAlcChk"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_PreAlcChk_MC extends MGBDL_PreAlcChk_MC_A{
	//FMCB CUSTOM START

	/**
	 * 操作種別：配賦先
	 */
	protected static final String MODE_DEST = "1";

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦計算結果を照合する<br>
	 */
	public class Srch01 extends MGBDL_PreAlcChk_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}
		
		protected void editUp() {
			if (up0().pre_alc_lvl_flg()){
				up0().addBooleanColumn("pre_alc_lvl_flg_on", true);
			}
			else {
				up0().addBooleanColumn("pre_alc_lvl_flg_off", false);
			}
			up0().down0_flg(true);
		}
		
		protected void srch() {
			if (isSame(up0().ope(), MODE_DEST)) {
				// 配賦先確認
				Srch01_CndR keyCnd = getKeyCnd();
				executeQuery(down1(), MGBDL0250_MGT_PRE_ALC_PATH_S01(), keyCnd);

				if (down1().isEmpty()) {
					return;
				}

				executeQuery(down0(), MGBDL0250_MGT_PRE_ALC_PATH_S01(), up0());
			}
			else {
				// 配賦元確認
				Srch01_CndR keyCnd = getKeyCnd();
				executeQuery(down1(), MGBDL0250_MGT_PRE_ALC_PATH_S02(), keyCnd);

				if (down1().isEmpty()) {
					return;
				}

				executeQuery(down0(), MGBDL0250_MGT_PRE_ALC_PATH_S02(), up0());
			}
		}

		protected Srch01_CndR getKeyCnd() {
			Srch01_CndR keyCnd = up0().clone();
			keyCnd.down1_flg(true);

			keyCnd.pre_alc_lvl_flg(false);
			keyCnd.src_wg_flg(false);
			keyCnd.src_alc_ac_flg(false);
			keyCnd.dest_wg_flg(false);
			keyCnd.dest_alc_ac_flg(false);
			keyCnd.ym_flg(false);
			keyCnd.dpt_flg(false);
			keyCnd.loc_flg(false);
			keyCnd.oper_flg(false);
			keyCnd.bp_flg(false);
			keyCnd.ctg_flg(false);
			keyCnd.itm_flg(false);
			keyCnd.itm_typ_flg(false);
			keyCnd.itm_typ_d_flg(false);
			keyCnd.lot_flg(false);
			keyCnd.sublot_flg(false);
			keyCnd.sno1_flg(false);
			keyCnd.sno2_flg(false);
			keyCnd.sno3_flg(false);
			keyCnd.sno4_flg(false);
			keyCnd.itm_mfg_inst_flg(false);
			keyCnd.iv_flg(false);
			keyCnd.po_flg(false);
			keyCnd.slo_flg(false);
			keyCnd.down0_flg(false);
			return keyCnd;
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editDown0();
		}
		

		protected void editDown0() {
			// dpt_cd2以外のキーでttlを集計
			down1().sort(Srch01_KeyR.$dpt_cd2);
			ArrayList<String> keyL = new ArrayList<String>();
			Arrays.asList(Srch01_RsltR.colnames()).forEach(r -> {
				if (!isSame(r, Srch01_RsltR.$dpt_cd2) && !isSame(r, Srch01_RsltR.$ttl)) {
					keyL.add(r);
				}
			});

			MCList<Srch01_RsltR> newDown0 = down0().createInstance();
			MCRowMapper<Srch01_RsltR,Srch01_RsltR> mapper = createMap_Srch01_RsltR_Srch01_RsltR();
			for (MCList<Srch01_RsltR> l : down0().groupList(keyL.toArray(new String[0]))) {
				MCIndexKey idxkey = l.createIndex(Srch01_RsltR.$dpt_cd2);
				Srch01_RsltR newR = l.get(0).clone();
				// col_allの生成
				ArrayList<String> colAllL = new ArrayList<String>();
				for (Srch01_KeyR r : down1()) {
					Srch01_RsltR tmp = l.getFirst(idxkey, r.dpt_cd2());
					colAllL.add(isNull(tmp) ? "" : tmp.ttl().toString());
				}
				copy(newR, newR, mapper);
				newR.ttl(l.sum(Srch01_RsltR.$ttl));
				newR.col_all(arrayValueJoin(colAllL.toArray(new String[0])));
				newDown0.add(newR);
			}
			down0().setAll(newDown0);
			down0().sort(Srch01_RsltR.$pre_alc_lvl, Srch01_RsltR.$ym, Srch01_RsltR.$wg_cd, Srch01_RsltR.$alc_ac_cd, Srch01_RsltR.$dpt_cd);
		}

		protected Map_Srch01_RsltR_Srch01_RsltR<Srch01_RsltR,Srch01_RsltR> createMap_Srch01_RsltR_Srch01_RsltR() {
			return new Map_Srch01_RsltR_Srch01_RsltR<Srch01_RsltR, Srch01_RsltR>();
		}

		public class Map_Srch01_RsltR_Srch01_RsltR<D extends Srch01_RsltR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				if (isSame(up0().ope(), MODE_DEST)) {
					addColumnPathMap(Srch01_RsltR.$wg_cd, Srch01_RsltR.$src_wg_cd);
					addColumnPathMap(Srch01_RsltR.$wg_nm, Srch01_RsltR.$src_wg_nm);
					addColumnPathMap(Srch01_RsltR.$alc_ac_cd, Srch01_RsltR.$src_alc_ac_cd);
					addColumnPathMap(Srch01_RsltR.$alc_ac_nm, Srch01_RsltR.$src_alc_ac_nm);
					addColumnPathMap(Srch01_RsltR.$wg_cd2, Srch01_RsltR.$dest_wg_cd);
					addColumnPathMap(Srch01_RsltR.$wg_nm2, Srch01_RsltR.$dest_wg_nm);
					addColumnPathMap(Srch01_RsltR.$alc_ac_cd2, Srch01_RsltR.$dest_alc_ac_cd);
					addColumnPathMap(Srch01_RsltR.$alc_ac_nm2, Srch01_RsltR.$dest_alc_ac_nm);
				}
				else {
					addColumnPathMap(Srch01_RsltR.$wg_cd, Srch01_RsltR.$dest_wg_cd);
					addColumnPathMap(Srch01_RsltR.$wg_nm, Srch01_RsltR.$dest_wg_nm);
					addColumnPathMap(Srch01_RsltR.$alc_ac_cd, Srch01_RsltR.$dest_alc_ac_cd);
					addColumnPathMap(Srch01_RsltR.$alc_ac_nm, Srch01_RsltR.$dest_alc_ac_nm);
					addColumnPathMap(Srch01_RsltR.$wg_cd2, Srch01_RsltR.$src_wg_cd);
					addColumnPathMap(Srch01_RsltR.$wg_nm2, Srch01_RsltR.$src_wg_nm);
					addColumnPathMap(Srch01_RsltR.$alc_ac_cd2, Srch01_RsltR.$src_alc_ac_cd);
					addColumnPathMap(Srch01_RsltR.$alc_ac_nm2, Srch01_RsltR.$src_alc_ac_nm);
				}
			}
		}
	}

	//FMCB CUSTOM END
}