package mcframe.serverMSUC.MSUCL0030;

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
import static mcframe.serverCore.requester.MCRequestObject.object;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import java.math.RoundingMode;
//FMCB CUSTOM_IMPORT END

/**
 * "MSUCL_ProdUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_ProdUtil_MC extends MSUCL_ProdUtil_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MSUCL_ProdUtil> CLAZZ = MSUCL_ProdUtil.class;

	/**
	 * 基準単位指図数量を基準単位出来高数量へ変換します。
	 * @param mst_mfg_inst_qty 製造指図数量（マスタ）
	 * @param mst_yield_schd_qty 出来高予定数量（マスタ）
	 * @param base_unit_inst_qty 基準単位指図数量
	 * @param base_unit_dec_place 基準単位有効桁数
	 * @param mst_fxd_rqmt_qty 固定必要数量（マスタ）
	 * @return 基準単位出来高数量
	 */
	public static MCNumber convQtyInstToYield(MCNumber mst_mfg_inst_qty,
			MCNumber mst_yield_schd_qty, MCNumber base_unit_inst_qty,
			MCNumber base_unit_dec_place, MCNumber mst_fxd_rqmt_qty) {
		return object(CLAZZ)._convQtyInstToYield(mst_mfg_inst_qty, mst_yield_schd_qty,
				base_unit_inst_qty, base_unit_dec_place, mst_fxd_rqmt_qty);
	}

	protected MCNumber _convQtyInstToYield(MCNumber mst_mfg_inst_qty,
			MCNumber mst_yield_schd_qty, MCNumber base_unit_inst_qty,
			MCNumber base_unit_dec_place, MCNumber mst_fxd_rqmt_qty) {

		MCNumber yieldQty;

		if (isNullOr(mst_mfg_inst_qty, mst_yield_schd_qty) || mst_mfg_inst_qty.isZero()) {
			// 製造指図数量（マスタ）または出来高予定数量（マスタ）のいずれかひとつがＮＵＬＬ
			// もしくは製造指図数量（マスタ）が０の場合、出来高予定数量には基準単位指図数量を設定する
			yieldQty = base_unit_inst_qty;
		}
		else {
			// 上記以外は製造指図数量を出来高予定数量へ変換する
			yieldQty = base_unit_inst_qty.multiply(mst_yield_schd_qty).divide(
					mst_mfg_inst_qty, base_unit_dec_place.intValue(),
					MAC_RND_TYP.toMC(MAC_RND_TYP.CUTOFF.value()));
		}
		// 固定必要数量（マスタ）が存在する場合、出来高予定数量から固定必要数量（マスタ）を減算したものを戻り値とする（マイナス値の場合はゼロ）
		MCNumber fixQty = nvl(mst_fxd_rqmt_qty, MCNumber.ZERO);
		yieldQty = yieldQty.subtract(fixQty);
		if (yieldQty.isNegative()) {
			return MCNumber.ZERO;
		}
		return yieldQty;
	}

	/**
	 * 基準単位数量を工程単位数量へ変換します。
	 * <br>
	 * 変換が可能な場合、工程単位数量へ変換された値が返されます。
	 * 変換が不可能な場合、nullが返されます。
	 * その場合、呼出元で工程単位数量、工程単位ＣＤ、工程単位名、工程単位小数部有効桁数には基準単位の値を設定し
	 * 工程基準単位数量、工程換算単位数量には固定値として1を設定する必要があります。
	 * @param base_unit_qty 基準単位数量
	 * @param oper_conv_qty 工程換算単位数量
	 * @param oper_std_qty 工程基準単位数量
	 * @param oper_unit_dec_place 工程単位小数部有効桁数
	 * @param oper_unit_conv_rnd_typ 工程単位端数処理区分
	 * @return 工程単位数量
	 */
	public static MCNumber convQtyBaseToOper(MCNumber base_unit_qty,
			MCNumber oper_conv_qty, MCNumber oper_std_qty, MCNumber oper_unit_dec_place,
			String oper_unit_conv_rnd_typ) {
		return object(CLAZZ)._convQtyBaseToOper(base_unit_qty, oper_conv_qty,
				oper_std_qty, oper_unit_dec_place, oper_unit_conv_rnd_typ);
	}

	protected MCNumber _convQtyBaseToOper(MCNumber base_unit_qty, MCNumber oper_conv_qty,
			MCNumber oper_std_qty, MCNumber oper_unit_dec_place,
			String oper_unit_conv_rnd_typ) {

		if (isNullOr(oper_std_qty, oper_conv_qty, oper_unit_dec_place,
				oper_unit_conv_rnd_typ) || oper_std_qty.isZero()) {
			// 工程基準単位数量、工程換算単位数量、工程単位小数部有効桁数、工程換算端数処理区分のいずれかひとつがＮＵＬＬ
			// もしくは工程基準単位数量が０の場合、nullを返す
			return null;
		}
		else {
			// 上記以外は基準単位数量を工程単位数量へ変換する
			return base_unit_qty.multiply(oper_conv_qty).divide(oper_std_qty,
					oper_unit_dec_place.intValue(),
					MAC_RND_TYP.toMC(oper_unit_conv_rnd_typ));
		}
	}
	/**
	 * 工程単位数量を基準単位数量へ変換します。
	 * <br>
	 * 基準単位ＣＤと工程単位ＣＤが同じ場合、oper_unit_qtyを返します。
	 * 基準単位ＣＤと工程単位ＣＤが異なる場合、基準単位数量へ変換された値を返します。
	 * 換算に必要な引数がnullの場合、nullを返します。
	 * @param oper_unit_qty 工程単位数量
	 * @param oper_conv_qty 工程換算単位数量
	 * @param oper_std_qty 工程基準単位数量
	 * @param base_unit_dec_place 基準単位小数部有効桁数
	 * @param base_unit_conv_rnd_typ 基準単位端数処理区分
	 * @param base_unit_cd 基準単位ＣＤ
	 * @param oper_unit_cd 工程単位ＣＤ
	 * @return 工程単位数量
	 */
	public static MCNumber convQtyOperToBase(MCNumber oper_unit_qty,
			MCNumber oper_conv_qty, MCNumber oper_std_qty, MCNumber base_unit_dec_place,
			String base_unit_conv_rnd_typ, String base_unit_cd, String oper_unit_cd) {
		return object(CLAZZ)._convQtyOperToBase(oper_unit_qty, oper_conv_qty,
				oper_std_qty, base_unit_dec_place, base_unit_conv_rnd_typ, base_unit_cd, oper_unit_cd);
	}

	protected MCNumber _convQtyOperToBase(MCNumber oper_unit_qty, MCNumber oper_conv_qty,
			MCNumber oper_std_qty, MCNumber base_unit_dec_place,
			String base_unit_conv_rnd_typ, String base_unit_cd, String oper_unit_cd) {
		if (isSame(base_unit_cd, oper_unit_cd)) {
			return oper_unit_qty;
		}
		if (isNullOr(oper_std_qty, oper_conv_qty, base_unit_dec_place,
				base_unit_conv_rnd_typ) || oper_conv_qty.isZero()) {
			return null;
		}
		else {
			return oper_unit_qty.multiply(oper_std_qty).divide(oper_conv_qty,
					base_unit_dec_place.intValue(),
					MAC_RND_TYP.toMC(base_unit_conv_rnd_typ));
		}
	}
	/**
	 * 品目詳細マスタの存在チェックをキーで行う。
	 * 資産管理対象外品はチェック対象外とする。
	 * 呼出前にsetAttributesを実行しておく必要がある。st_dtに適用日を連携する。
	 * @param itmDtlL　対象の品目詳細
	 * @return　存在チェック後のメッセージのリスト
	 */
	public static MCMessageList chkItmDtlKey(MCList<MAM_ITM_DTL_R> itmDtlL) {		
		return chkItmDtlKey(itmDtlL, false);
	}
	
	/**
	 * 品目詳細マスタの存在チェックをキーで行う。
	 * 資産管理対象外品はチェック対象外とする。
	 * 呼出前にsetAttributesを実行しておく必要がある。st_dtに適用日を連携する。
	 * @param itmDtlL　対象の品目詳細
	 * @param compFlg　補完フラグ
	 * @return
	 */
	public static MCMessageList chkItmDtlKey(MCList<MAM_ITM_DTL_R> itmDtlL, boolean compFlg) {
		MCMessageList msgL = new MCMessageList();
		
		if(itmDtlL.isEmpty()) {
			return msgL;
		}
		
		MAM_ITM_R t = MAM_ITM_R.create("T");

		MCQueryApiBuilder itmDbc_bldr = MCQueryApiBuilder.create(t);
		itmDbc_bldr.setSelect(t.itm_cd);
		itmDbc_bldr.addSelect(t.asset_mng_typ);

		FXUCL_MCDbcCache<MAM_ITM_R> itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
				itmDbc_bldr, itmDtlL, MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2,
				MAM_ITM_R.$itm_sub3);

		MAM_ITM_DTL_R t1 = MAM_ITM_DTL_R.create("T");
		MAM_WG_R wg = MAM_WG_R.create("WG");

		MCQueryApiBuilder itmDtlDbc_bldr = MCQueryApiBuilder.create(t1);
		itmDtlDbc_bldr.setSelect(t1.itm_cd);
		if(compFlg) {
			itmDtlDbc_bldr.addSelect(nvl( t1.rqst_wg_cd, t1.wg_cd).as("rqst_wg_cd"));
			itmDtlDbc_bldr.addSelect(wg.wg_nm.as("rqst_wg_nm"));
			itmDtlDbc_bldr.addLeftOuterJoin(wg, bracket( wg.wg_cd.eq(nvl( t1.rqst_wg_cd, t1.wg_cd ) )));			
		}
		
		FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R> itmDtlCache = new FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R>(
				itmDtlDbc_bldr, itmDtlL, MAM_ITM_DTL_R.$itm_cd,
				MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
				MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$mfg_loc_cd,
				MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd,
				MAM_ITM_DTL_R.$rqst_loc_cd, MAM_ITM_DTL_R.$wg_cd,
				MAM_ITM_DTL_R.$bom_ptn);
		
		for(MAM_ITM_DTL_R r : itmDtlL) {
			MAM_ITM_R itmR = itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			
			if(!isNull(itmR.itm_cd()) && !MAC_ASSET_MNG_TYP.isNOT_MNG(itmR.asset_mng_typ())) {
				MAM_ITM_DTL_R itmDtlR = itmDtlCache.get(r.st_dt(), r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3(), r.mfg_loc_cd(),
						r.sppl_cd(), r.maker_cd(), r.rqst_loc_cd(), r.wg_cd(), r.bom_ptn());
				if(isNull(itmDtlR.itm_cd())) {
					msgL.add(new MCMessage(r, null, MSBCL0030,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
									r.itm_sub3()),
							r.bom_ptn(), r.mfg_loc_cd(), r.sppl_cd(), r.maker_cd(),
							r.rqst_loc_cd(), r.wg_cd(), toYMDString(r.st_dt()),
							toDispGUIIndex(r)));
				}
				else if (compFlg) {
					r.rqst_wg_cd(itmDtlR.rqst_wg_cd());
					r.setStringNE("rqst_wg_nm", itmDtlR.getStringNE("rqst_wg_nm"));
				}
			}
		}
		
		return msgL;
	}
	
	/**
	 * 品目詳細マスタの存在チェックを発注先・メーカに対して行う。
	 * 資産管理対象外品はチェック対象外とする。
	 * 呼出前にsetAttributesを実行しておく必要がある。st_dtに適用日を連携する。
	 * @param itmDtlL　対象の品目詳細
	 * @return　存在チェック後のメッセージのリスト
	 */
	public static MCMessageList chkItmDtlPurc(MCList<MAM_ITM_DTL_R> itmDtlL) {
		MCMessageList msgL = new MCMessageList();
		
		if(itmDtlL.isEmpty()) {
			return msgL;
		}
		
		MAM_ITM_R t = MAM_ITM_R.create("T");

		MCQueryApiBuilder itmDbc_bldr = MCQueryApiBuilder.create(t);
		itmDbc_bldr.setSelect(t.itm_cd);
		itmDbc_bldr.addSelect(t.asset_mng_typ);

		FXUCL_MCDbcCache<MAM_ITM_R> itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
				itmDbc_bldr, itmDtlL, MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2,
				MAM_ITM_R.$itm_sub3);
		
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");

		MCList<MAM_ITM_DTL_R> chkItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t1 = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder chkItmDtlL_bldr = MCQueryApiBuilder.create(t1);
				
		chkItmDtlL_bldr.setSelect(t1.itm_cd);
		chkItmDtlL_bldr.addSelect(t1.itm_sub1);
		chkItmDtlL_bldr.addSelect(t1.itm_sub2);
		chkItmDtlL_bldr.addSelect(t1.itm_sub3);
		chkItmDtlL_bldr.addSelect(decode( m1.loc_cd, nullValue(), t1.sppl_cd, m1.sppl_cd).as("sppl_cd"));
		chkItmDtlL_bldr.addSelect(decode( m1.loc_cd, nullValue(), t1.maker_cd, nvl( m1.maker_cd, value(MAC_STR.NULL_VAL.value()) )).as("maker_cd"));
		chkItmDtlL_bldr.addSelect(t1.wg_cd);
		chkItmDtlL_bldr.addSelect(t1.st_dt);
		chkItmDtlL_bldr.addSelect(t1.end_dt);
		chkItmDtlL_bldr.addLeftOuterJoin(m1, m1.loc_cd.eq(t1.mfg_loc_cd));
		chkItmDtlL_bldr.setWhere(t1.itm_cd.eq(bind("itm_cd")));
		chkItmDtlL_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("itm_sub1")));
		chkItmDtlL_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("itm_sub2")));
		chkItmDtlL_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("itm_sub3")));
		chkItmDtlL_bldr.addWhereWithAnd(decode( m1.loc_cd, nullValue(), t1.sppl_cd, m1.sppl_cd).eq(bind("sppl_cd")));
		chkItmDtlL_bldr.addWhereWithAnd(decode( m1.loc_cd, nullValue(), t1.maker_cd, nvl( m1.maker_cd, value(MAC_STR.NULL_VAL.value()) )).eq(bind("maker_cd")));
		chkItmDtlL_bldr.addWhereWithAnd(t1.wg_cd.eq(bind("wg_cd")));
		dbSelect(createSqlId("MSUCL0030", t, "MSUCL_ProdUtil_S01"), chkItmDtlL,
				chkItmDtlL_bldr,
				itmDtlL.groupBy(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1,
						MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3,
						MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd,
						MAM_ITM_DTL_R.$wg_cd));

		MCIndexKey idxKey = chkItmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd,
				MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
				MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$sppl_cd,
				MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$wg_cd);
		
		for(MAM_ITM_DTL_R r : itmDtlL) {
			MAM_ITM_R itmR = itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			
			if(!isNull(itmR.itm_cd()) && !MAC_ASSET_MNG_TYP.isNOT_MNG(itmR.asset_mng_typ())) {
				MCList<MAM_ITM_DTL_R> tmpL = chkItmDtlL.subList(idxKey,
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						r.sppl_cd(), r.maker_cd(), r.wg_cd());
				if(isNull(tmpL)) {
					msgL.add(new MCMessage(r, null, MSBCL0030,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
									r.itm_sub3()),
							null, null, r.sppl_cd(), r.maker_cd(), null, r.wg_cd(),
							toYMDString(r.st_dt()), toDispGUIIndex(r)));
					continue;
				}
				boolean exists = false;
				for(MAM_ITM_DTL_R tmpR : tmpL) {
					if(r.st_dt().gte(tmpR.st_dt()) && r.st_dt().lte(tmpR.end_dt())) {
						exists = true;
					}
				}
				if(!exists) {
					msgL.add(new MCMessage(r, null, MSBCL0030,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
									r.itm_sub3()),
							null, null, r.sppl_cd(), r.maker_cd(), null, r.wg_cd(),
							toYMDString(r.st_dt()), toDispGUIIndex(r)));
				}
			}
		}
		
		return msgL;		
	}

	/**
	 * 同一代替グループＣＤ、代替グループ連番の投入のリストを受け取り、投入実績数量を元に代替元数量の残数を算出します。<br>
	 * 引数となるコンテナの投入数量には、投入予定または投入実績残に対して発生した投入実績の数量の合計を設定します。<br>
	 * 有効成分対象の場合、投入実績の有効成分を設定します。<br>
	 * @param dtlL 処理対象のリスト
	 * @param altQtyCol 基準単位の代替元数量を格納したカラム名 Number
	 * @param inptQtyCol 紐付く投入実績の投入数量の合計を格納したカラム名 Number
	 * @param decPlaceCol 投入品の基準単位の小数部有効桁数を格納したカラム名 Number
	 * @param retQtyCol 戻り値（基準単位の代替元数の残数）を格納するカラム名 Number
	 * @return
	 */
	public static <T extends MCRow> void reCalcAltQty(MCList<T> dtlL, String altQtyCol,
			String inptQtyCol, String decPlaceCol,
			String retQtyCol) {
		object(CLAZZ)._reCalcAltQty(dtlL, altQtyCol, inptQtyCol, decPlaceCol,
				retQtyCol);
	}

	protected <T extends MCRow> void _reCalcAltQty(MCList<T> dtlL, String altQtyCol,
			String inptQtyCol, String decPlaceCol,
			String retQtyCol) {

		// すべてのレコードの代替元数が同じ場合は処理を分ける（端数がでないようにするため）
		MCList<T> altQtyL = dtlL.groupBy(altQtyCol);
		if (altQtyL.size() == 1) {
			// 代替元数が単一
			_reCalcAltQtySingle(dtlL, altQtyCol, inptQtyCol, retQtyCol);
		}
		else {
			// 代替元数が混在
			_reCalcAltQtyMix(dtlL, altQtyCol, inptQtyCol, decPlaceCol,
					retQtyCol);
		}
	}

	/**
	 * 代替元数が混在または有効成分対象の場合の残数算出処理
	 * （各レコードの実績数の比率を算出し、全体の比率を算出する）
	 * @param dtlL
	 * @param altQtyCol
	 * @param inptQtyCol
	 * @param decPlaceCol
	 * @param retQtyCol
	 */
	protected <T extends MCRow> void _reCalcAltQtyMix(MCList<T> dtlL, String altQtyCol,
			String inptQtyCol, String decPlaceCol, String retQtyCol) {

		MCNumber actRatio = MCNumber.ZERO;

		// 実績登録済の比率を算出する
		for (MCRow dtlR : dtlL) {

			// 比率＝投入数量／代替元数量
			actRatio = actRatio
					.add(dtlR.getNumber(inptQtyCol).divide(dtlR.getNumber(altQtyCol),
							_altActRatioDecPlace, _altActRatioRndMode));
		}

		if (actRatio.lt(MCNumber.ONE)) {
			// 実績登録済の比率が１に満たない場合、残数を算出する

			// 不足率の算出（１－実績登録済の比率）
			MCNumber shortRatio = MCNumber.ONE.subtract(actRatio);

			for (MCRow dtlR : dtlL) {

				// 残数は代替元数量×不足率（不足数は切り上げ）
				dtlR.setNumber(retQtyCol,
						dtlR.getNumber(altQtyCol).multiply(shortRatio,
								dtlR.getNumber(decPlaceCol).intValue(),
								MAC_RND_TYP.RNDUP.toMC()));
			}
		}
		else {
			// 実績登録済の比率が１の場合、残数をすべて０で返す
			for (MCRow dtlR : dtlL) {
				dtlR.setNumber(retQtyCol, MCNumber.ZERO);
			}
		}
	}

	/**
	 * 代替元数が単一の場合の残数算出処理
	 * （各レコードの実績数を合計し、全体の実績数を算出する）
	 * @param dtlL
	 * @param altQtyCol
	 * @param inptQtyCol
	 * @param decPlaceCol
	 * @param retQtyCol
	 */
	protected <T extends MCRow> void _reCalcAltQtySingle(MCList<T> dtlL, String altQtyCol,
			String inptQtyCol, String retQtyCol) {

		// レコードの最初の代替元数を取得
		MCRow firstR = dtlL.get(0);
		MCNumber altQty = firstR.getNumber(altQtyCol);

		// 投入数量の合計を取得
		MCNumber inptQty = dtlL.sum(inptQtyCol);

		// 残数量を取得
		MCNumber remQty = altQty.subtract(inptQty);

		// 残数量＞０の場合、各レコードに残数量を設定
		if (remQty.gt(MCNumber.ZERO)) {
			dtlL.setNumber(retQtyCol, remQty);
		}
		else {
			dtlL.setNumber(retQtyCol, MCNumber.ZERO);
		}
	}

	/**
	 * 代替Ｇで実績登録済みの比率(実績数／代替元数)を求める際の小数部有効桁数
	 */
	protected int _altActRatioDecPlace = 8;

	/**
	 * 代替Ｇで実績登録済みの比率(実績数／代替元数)を求める際の端数処理区分
	 */
	protected java.math.RoundingMode _altActRatioRndMode = MAC_RND_TYP.CUTOFF.toMC();

	/**
	 * 同一代替グループコード、代替グループ連番のリストに対し、投入数量、必要数量、固定必要数量を案分する。
	 * 
	 * @param altGrpL 同一代替グループコード、代替グループ連番のレコード
	 * @param altItmTypCol 代替品目選択区分を格納するカラム名
	 * @param altItmRatioCol 代替品目比率を格納するカラム名
	 * @param itmCdCol 品目コードを格納するカラム名
	 * @param rqmtQtyCol 案分前の必要数量を格納するカラム名
	 * @param decPlaceCol 小数部有効桁数を格納するカラム名
	 * @param rsltRqmtQtyCol 案分後の必要数量が格納されるカラム名
	 */
	public static <T extends MCRow> void setAltQty(MCList<T> altGrpL, String altItmTypCol, String altItmRatioCol, String itmCdCol, String rqmtQtyCol, String decPlaceCol, String rsltRqmtQtyCol) {
		object(CLAZZ)._setAltQty(altGrpL, altItmTypCol, altItmRatioCol, itmCdCol, rqmtQtyCol, decPlaceCol, rsltRqmtQtyCol);
	}
	
	protected <T extends MCRow> void _setAltQty(MCList<T> altGrpL, String altItmTypCol, String altItmRatioCol, String itmCdCol, String rqmtQtyCol, String decPlaceCol, String rsltRqmtQtyCol) {
		if(MAC_ALT_ITM_TYP.isMIX(altGrpL.get(0).getString(altItmTypCol))) {
			// 代替品目選択区分が混在可の場合
			setAltItmQtyMix(altGrpL, altItmRatioCol, itmCdCol, rqmtQtyCol, decPlaceCol, rsltRqmtQtyCol);
		}
		else {
			// 代替品目選択区分が混在不可の場合
			setAltItmQtyMono(altGrpL, altItmRatioCol, itmCdCol, rqmtQtyCol, rsltRqmtQtyCol);
		}
	}

	/**
	 * 代替品目選択区分が混在可の場合の案分処理<BR>
	 * 代替品目比率に従い、投入数量、必要数量、固定必要数量を案分する。
	 * 
	 * @param altGrpL 同一代替グループコード、代替グループ連番のレコード
	 * @param altItmRatioCol 代替品目比率を格納するカラム名
	 * @param itmCdCol 品目コードを格納するカラム名
	 * @param rqmtQtyCol 案分前の必要数量を格納するカラム名
	 * @param decPlaceCol 小数部有効桁数を格納するカラム名
	 * @param rsltRqmtQtyCol 案分後の必要数量が格納されるカラム名
	 */
	protected <T extends MCRow> void setAltItmQtyMix(MCList<T> altGrpL, String altItmRatioCol, String itmCdCol, String rqmtQtyCol, String decPlaceCol, String rsltRqmtQtyCol) {
		//MRPの仕様と合わせる
		int cnt,size;
		cnt = size = altGrpL.size();
		altGrpL.sort(MCList.SortType.ASC, altItmRatioCol, itmCdCol);
		MCNumber dmn = altGrpL.sum(altItmRatioCol);
		RoundingMode rndoff = MAC_RND_TYP.RNDOFF.toMC();
		RoundingMode rndup = MAC_RND_TYP.RNDUP.toMC();
		for(int i = 0; i < size; i++){
			MCRow r = altGrpL.get(i);
			MCNumber leftRqmt = r.getNumber(rqmtQtyCol);
			for(int j = 0; j < i; j++){
				MCRow q = altGrpL.get(j);
				leftRqmt = leftRqmt.subtract(numCalc(r.getNumber(rqmtQtyCol), q.getNumber(rsltRqmtQtyCol), q.getNumber(rqmtQtyCol), r.getNumber(decPlaceCol), rndoff));
			}
			MCNumber rqmt = numCalc(leftRqmt, r.getNumber(altItmRatioCol), dmn, r.getNumber(decPlaceCol), cnt == 1? rndup: rndoff);
			//混在可の場合,子固定必要数量は0の想定
			r.setNumber(rsltRqmtQtyCol, rqmt);
			dmn = dmn.subtract(r.getNumber(altItmRatioCol));
			cnt--;
		}
	}

	/**
	 * 代替品目選択区分が混在不可の場合の案分処理<BR>
	 * 代替品目比率が最も大きいレコード以外は投入数量、必要数量、固定必要数量をすべてゼロにする。<BR>
	 * 代替品目比率が最も大きいレコードが複数存在する場合、品目コードが最も小さいレコードを対象とする。
	 * 
	 * @param altGrpL 同一代替グループコード、代替グループ連番のレコード
	 * @param altItmRatioCol 代替品目比率を格納するカラム名
	 * @param itmCdCol 品目コードを格納するカラム名
	 * @param rqmtQtyCol 案分前の必要数量を格納するカラム名
	 * @param rsltRqmtQtyCol 案分後の必要数量が格納されるカラム名
	 */
	protected <T extends MCRow> void setAltItmQtyMono(MCList<T> altGrpL, String altItmRatioCol, String itmCdCol, String rqmtQtyCol, String rsltRqmtQtyCol) {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(MCList.SortType.DESC, altItmRatioCol);
		sp.add(MCList.SortType.ASC, itmCdCol);
		altGrpL.sort(sp);
		int cnt = 0;
		for(MCRow r: altGrpL){
			if(cnt == 0){
				r.setNumber(rsltRqmtQtyCol, r.getNumber(rqmtQtyCol));
			}
			else {
				r.setNumber(rsltRqmtQtyCol, MCNumber.ZERO);
			}
			cnt++;
		}
	}

	/**
	 * 数量×（分子÷分母）を計算する
	 * @param qty 数量
	 * @param nmr 分子
	 * @param dnm 分母
	 * @param scale 小数部有効桁数
	 * @param rm 端数処理区分
	 * @return 計算値
	 */
	protected MCNumber numCalc(MCNumber qty, MCNumber nmr, MCNumber dnm, MCNumber scale, RoundingMode rm) {
		if(isNullOr(qty, nmr, dnm) || !nmr.gt(0) || !dnm.gt(0)) {
			return MCNumber.ZERO;
		}
		return qty.multiply(nmr).divide(dnm, isNull(scale)? 0: scale.intValue(), rm);
	}
	//FMCB CUSTOM END
}