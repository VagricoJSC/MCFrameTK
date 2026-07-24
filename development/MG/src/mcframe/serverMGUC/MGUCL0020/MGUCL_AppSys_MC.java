package mcframe.serverMGUC.MGUCL0020;

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
import mcframe.serverMA.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGUCL_AppSys"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGUCL_AppSys_MC extends MGUCL_AppSys_MC_A{
	//FMCB CUSTOM START

	// スレッドセーフ対応（ここから）
	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MGUCL_AppSys> CLAZZ = MGUCL_AppSys.class;
	// スレッドセーフ対応（ここまで）

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 費目情報を取得します。<br>
	 */
	public class Srch01 extends MGUCL_AppSys_MC_A.Srch01 {
		@Override
		protected void call() {
			expnsInfo();
		}

		protected void expnsInfo() {
			for (MAM_EXPNS_R srcR : getExpns()) {
				ExpnsR destR = down0().createRow();
				createMap_ExpnsR_MAM_EXPNS_R().copy(destR, srcR);
				down0().add(destR);
			}
		}
	}
	protected Map_ExpnsR_MAM_EXPNS_R<ExpnsR,MAM_EXPNS_R> createMap_ExpnsR_MAM_EXPNS_R() {
		return new Map_ExpnsR_MAM_EXPNS_R<ExpnsR, MAM_EXPNS_R>();
	}

	public class Map_ExpnsR_MAM_EXPNS_R<D extends ExpnsR, S extends MAM_EXPNS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ExpnsR.$expns_cd, MAM_EXPNS_R.$expns_cd);
			addColumnPathMap(ExpnsR.$expns_nm, MAM_EXPNS_R.$expns_nm);
			addColumnPathMap(ExpnsR.$expns_grp_cd, MAM_EXPNS_R.$expns_grp_cd);
			addColumnPathMap(ExpnsR.$expns_typ, MAM_EXPNS_R.$expns_typ);
			addColumnPathMap(ExpnsR.$direct_typ, MAM_EXPNS_R.$direct_typ);
			addColumnPathMap(ExpnsR.$var_typ, MAM_EXPNS_R.$var_typ);
			addColumnPathMap(ExpnsR.$expns_seq, MAM_EXPNS_R.$expns_seq);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.expns_grp_nm(src.getStringNE("expns_grp_nm"));
			dest.expns_grp_seq(src.getNumberNE("expns_grp_seq"));
		}
	}

	protected MCList<MAM_EXPNS_R> _expns = null;

	public static MCList<MAM_EXPNS_R> getExpns() {
		return object(CLAZZ)._getExpns();
	}

	protected MCList<MAM_EXPNS_R> _getExpns() {
		if (null == _expns) {
			MAM_EXPNS_GRP_R grp1 = MAM_EXPNS_GRP_R.create("GRP1");
			MAM_EXPNS_R t = MAM_EXPNS_R.create("T");
			_expns = MCList.create(MAM_EXPNS_R.class);
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.addSelect(grp1.expns_grp_nm);
			builder.addSelect(grp1.expns_grp_seq);
			builder.addLeftOuterJoin(grp1, t.expns_grp_cd.eq(grp1.expns_grp_cd));
			builder.setOrderByAsc(grp1.expns_grp_seq, t.expns_grp_cd, t.expns_seq, t.expns_cd);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), _expns, builder);
		}
		return _expns;
	}

	//FMCB CUSTOM END
}