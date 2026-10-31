package mcframe.serverMSUA.MSUAL0030;

import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonMA.constant.MAC_BP_ADDR_TYP;
import mcframe.commonMA.constant.MAC_BP_IS_SRCH_TYP;
import mcframe.commonMA.constant.MAC_DEBT_CRED_ID_TYP;
import mcframe.commonMA.constant.MAC_IF_PROC_TYP;
import mcframe.commonMA.constant.MAC_OUTSRC_UPRI_TYP;

import static mcframe.commonMSUA.MSUAC0030.MSUAC_List_MC.SloDlvCols;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMA.dbc.MAM_BP_GRP_R;
import mcframe.serverMA.dbc.MAM_BP_ITM_R;
import mcframe.serverMA.dbc.MAM_BP_R;
import mcframe.serverMA.dbc.MAM_CST_DLV_R;
import mcframe.serverMA.dbc.MAM_CST_USR_R;
import mcframe.serverMA.dbc.MAM_CUR_R;
import mcframe.serverMA.dbc.MAM_EDI_IF_CTL_R;
import mcframe.serverMA.dbc.MAM_SPPL_USR_R;
import mcframe.serverMA.dbc.MAM_TRD_R;
import mcframe.serverMA.dbc.MAM_TTERM_R;
import mcframe.serverMA.dbc.MAW_BP_LL_R;

import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.SloItmCols;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil_MC.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List_MC.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil_FW.*;
import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil_FW.*;
import static mcframe.commonCore.lang.MCBooleanUtil.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil_MC.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;

import mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys;
import mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil;

/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@EI
public class MSUAL_List extends MSUAL_List_MC {
	protected int _cstdlv_sql = 0;
	
	protected void _setSloItmDefaultValuesToRow(MCRow row, MCRow down) {
		super._setSloItmDefaultValuesToRow(row, down);
		
		String wgCd = row.getStringNE(SloItmCols.$i_hdr_wg_cd);
		String itmCd = down.getStringNE(SloItmCols.$o_itm_cd);
		String itmSub1 = down.getStringNE(SloItmCols.$o_itm_sub1);
		String itmSub2 = down.getStringNE(SloItmCols.$o_itm_sub2);
		String itmSub3 = down.getStringNE(SloItmCols.$o_itm_sub3);

		MCNumber listUpri = null;
		MCNumber wlSlsUpri = null;
		
		// 標準販売単価マスタより定価・仕切単価を設定
		MCRow stdUpriRow = getStdSlsUpriRow(itmCd, itmSub1, itmSub2, itmSub3, wgCd);
		if (stdUpriRow != null) {
			listUpri = stdUpriRow.getNumberNE(mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R.$upri);
			down.setNumberNE(SloItmCols.$o_list_pri, listUpri);
			wlSlsUpri = stdUpriRow.getNumberNE(mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R.$wl_sale_upri);
			down.setNumberNE(SloItmCols.$o_wl_sale_upri, wlSlsUpri);
		}
		
		String upriTyp = null;
		MCNumber upriRate = null;
		
		// 得意先販売単価マスタより単位区分・掛率を設定
		String cstCd = row.getStringNE(SloItmCols.$i_bp_cd);
		MCRow cstUpriRow = (cstCd != null) ? getCstSlsUpriRow(cstCd, itmCd, itmSub1, itmSub2, itmSub3, wgCd) : null;
		if (cstUpriRow != null) {
			upriTyp = cstUpriRow.getStringNE(mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R.$upri_typ);
			down.setStringNE(SloItmCols.$o_upri_typ, upriTyp);

			upriRate = cstUpriRow.getNumberNE(mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R.$upri_rate);
			down.setNumberNE(SloItmCols.$o_upri_rate, upriRate);
			switch (upriTyp) {
				case "1": down.setStringNE(SloItmCols.$o_upri_typ_nm, "定価"); break;
				case "2": down.setStringNE(SloItmCols.$o_upri_typ_nm, "仕切"); break;
			}
		}

//		if (listUpri != null && wlSlsUpri != null && upriTyp != null && upriRate != null) {
//			// 単価
//			MCNumber upri = null;
//			switch (upriTyp) {
//				case "1": upri = listUpri.multiply(upriRate).divide(100); break;
//				case "2": upri = wlSlsUpri.multiply(upriRate).divide(100); break;
//			}
//			down.setNumberNE(SloItmCols.$o_trd_cur_upri, upri);
//			
//			// 数量
//			MCNumber qty = MCNumber.ONE;
//			
//			// 値引額
//			MCNumber discntAmt = upriRate.add(-100).multiply(-1).multiply(upri).multiply(qty).divide(100);
//			down.setNumberNE(SloItmCols.$o_trd_cur_dscnt_amt, discntAmt);
//			
//			// 金額
//			MCNumber amt = upri.multiply(qty).subtract(discntAmt);
//			down.setNumberNE(SloItmCols.$o_trd_cur_amt, amt);
//			
//		}
	}
	
	/**
	 * 対象の品目に紐付く定価・仕切単価を取得
	 *
	 * @return 標準販売単価マスタレコード
	 */
	public MCRow getStdSlsUpriRow(
		String itm_cd,
		String itm_sub1,
		String itm_sub2,
		String itm_sub3,
		String wg_cd) {

		MCRow r = MCRow.create();
		r.setStringNE("itm_cd", itm_cd);
		r.setStringNE("itm_sub1", itm_sub1);
		r.setStringNE("itm_sub2", itm_sub2);
		r.setStringNE("itm_sub3", itm_sub3);
		r.setStringNE("wg_cd", wg_cd);
		
		MCList<mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R> resultList = MCList.create(mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R.class);
		mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R m1 = mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R.create("M1");
		IFMCSQL.MCDateValue stDt = mcframe.serverCore.dbc.CoreFunction.FCPA_DATE_UTIL$F_GET_TODAY1();

		sql(MAUCL_DbUtil.createSqlId(LOGIC_ID, "MAM_STD_SLS_UPRI_S01", "getStdSlsUpriRow"))
				.mainQuery()
				.select(
						m1.upri
						, m1.wl_sale_upri
				)
				.from(m1)
				.where(
						m1.itm_cd.eq(bind("itm_cd"))
						.and(m1.itm_sub1.eq(bind("itm_sub1")))
						.and(m1.itm_sub2.eq(bind("itm_sub2")))
						.and(m1.itm_sub3.eq(bind("itm_sub3")))
						.and(
								m1.wg_cd.eq(bind("wg_cd"))
								.or(m1.wg_cd.eq(value("*")))
							)
						.and(stDt.between(m1.st_dt, m1.end_dt))
				)
				.executeQuery(r, resultList);

		return resultList.isEmpty() ? null : resultList.get(0);
	}
	
	/**
	 * 対象の品目に紐付く定価・仕切単価を取得
	 *
	 * @return 得意先販売単価マスタレコード
	 */
	public MCRow getCstSlsUpriRow(
		String cst_cd,
		String itm_cd,
		String itm_sub1,
		String itm_sub2,
		String itm_sub3,
		String wg_cd) {

		MCRow r = MCRow.create();
		r.setStringNE("cst_cd", cst_cd);
		r.setStringNE("itm_cd", itm_cd);
		r.setStringNE("itm_sub1", itm_sub1);
		r.setStringNE("itm_sub2", itm_sub2);
		r.setStringNE("itm_sub3", itm_sub3);
		r.setStringNE("wg_cd", wg_cd);
		
		MCList<mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R> resultList = MCList.create(mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R.class);
		mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R m1 = mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R.create("M1");
		IFMCSQL.MCDateValue stDt = mcframe.serverCore.dbc.CoreFunction.FCPA_DATE_UTIL$F_GET_TODAY1();

		sql(MAUCL_DbUtil.createSqlId(LOGIC_ID, "MAM_CST_SLS_UPRI_S01", "getCstSlsUpriRow"))
				.mainQuery()
				.select(
						m1.upri_typ
						, m1.upri_rate
				)
				.from(m1)
				.where(
						m1.cst_cd.eq(bind("cst_cd"))
						.and(m1.itm_cd.eq(bind("itm_cd")))
						.and(m1.itm_sub1.eq(bind("itm_sub1")))
						.and(m1.itm_sub2.eq(bind("itm_sub2")))
						.and(m1.itm_sub3.eq(bind("itm_sub3")))
						.and(
								m1.wg_cd.eq(bind("wg_cd"))
								.or(m1.wg_cd.eq(value("*")))
							)
						.and(stDt.between(m1.st_dt, m1.end_dt))
				)
				.executeQuery(r, resultList)
				;

		return resultList.isEmpty() ? null : resultList.get(0);
	}
	
	/** 
	  * SloTrd:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	private static final String HAKUYOU_SERVICE_DTP_CD = "D20110";	
	private static final HashSet<String> HAKUYOU_SERVICE_TRD_CD_SET = new HashSet<String>(Arrays.asList(
			"010"
			, "020"
			, "030"
			, "040"
			, "050"
			, "060"
			, "070"
			, "080"
			, "800"
			, "9XX"
			, "9YY"
	));
	protected MCList<?> getSloTrd_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TRD_R t, MCList<?> result){
		String dptCd = row.getStringNE("sls_dpt_cd");
		if (dptCd != null && HAKUYOU_SERVICE_DTP_CD.equals(dptCd)) {
			@SuppressWarnings("unchecked")
			Iterator<MAM_TRD_R> itr = (Iterator<MAM_TRD_R>)result.iterator();
			while (itr.hasNext()) {
				MAM_TRD_R r = itr.next();
				if (!HAKUYOU_SERVICE_TRD_CD_SET.contains(r.trd_cd())) {
					itr.remove();
				}
			}
		}		
		
		return (MCList<?>)result;
	}	
	
	/** 
	  * SloBp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	@Override
	protected MCList<?> getSloBp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		@SuppressWarnings("unchecked")
		MCList<MAM_BP_R> bpList = ((MCList<MAM_BP_R>)result);
		
		String dptCd = row.getStringNE("sls_dpt_cd");
		if (dptCd != null) {
			Iterator<MAM_BP_R> itr = bpList.iterator();
			while (itr.hasNext()) {
				MAM_BP_R r = itr.next();
				// 得意先ではない、または売上部門CDと先頭列は一致しない場合は除外
				if (!r.cst_flg() || !r.bp_cd().startsWith(dptCd)) {
					itr.remove();
				}
			}
		}
		
		return (MCList<?>)result;
	}
	
	/** 
	  * SloBp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	@Override
	protected void getSloBp_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		super.getSloBp_Set(row, builder, t, result);
		
		getSloBp_addSelectJoinCustom(row, builder, t, result);
	}
	
	protected void getSloBp_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		mcframe.serverMA.dbc.MAM_CST_USR_R m1 = mcframe.serverMA.dbc.MAM_CST_USR_R.create("M1");
		
		builder.addSelect(t.cst_flg);
		builder.addSelect(t.bp_cd.as("dlv_cd"));
		builder.addSelect(m1.usr_cd.as("sls_usr_cd"));

		IFMCSQL.MCDateValue stDt = mcframe.serverCore.dbc.CoreFunction.FCPA_DATE_UTIL$F_GET_TODAY1();
		
		builder.addLeftOuterJoin(m1,
				bracket(t.bp_cd.eq(m1.cst_cd)
				.and(stDt.between(m1.st_dt, m1.end_dt))));
	
	}
	
	
	@Override
	protected void getSloDlv_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t,
			MCList<?> result) {
		super.getSloDlv_Set(row, builder, t, result);
		getSloDlv_addSelectJoinCustom(row, builder, t, result);
		getSloDlv_addWhereCustom(row, builder, t, result);
	}
	
	@Override
	protected MCList<?> getSloDlv_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result) {
		MCList<?> sl = super.getSloDlv_AfterSelect(row, builder, t, result);

		// 得意先CDは指定されない場合、抽出結果をゼロ件にする
		String cstCd = row.getStringNE("cst_cd");
		if (cstCd == null) {
			sl.clear();;
			return sl;
		}
		
		@SuppressWarnings("unchecked")
		Iterator<MAM_BP_R> itr = ((MCList<MAM_BP_R>)sl).iterator();
		while (itr.hasNext()) {
			MAM_BP_R r = itr.next();
			// 売上部門CDと先頭列は一致しない場合は除外
			if (!r.bp_cd().startsWith(cstCd)) {
				itr.remove();
			}
		}	
		
		String bp_is_srch_typ = row.getStringNE(SloDlvCols.$i_bp_is_srch_typ);

		// 区分１７：得意先（納品先対応）
		if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
			_cstdlv_sql = 1;

			//ORで分割した条件のデータを取得
			MAM_BP_R subp = MAM_BP_R.create("T");
			MCList<MAM_BP_R> auxRslt = MCList.create(subp);
			MCQueryApiBuilder auxBuilder = MCQueryApiBuilder.create(subp);
			getSloDlv_Set(row, auxBuilder, subp, auxRslt);
			listlogicCommon_Set(row, auxBuilder, "MA.MAUAL0010.Bp");
			MCList<MCRow> mergebinds = MCList.create(MCRow.class);
			mergebinds.add(builder.getMergeBind());
			auxBuilder.buildSelect(
					createSqlId("MA.MAUAL0010.Bp_getBp_AfterSelect", subp, "S01"))
					.executeQuery(row, mergebinds, auxRslt);

			String[] cols = auxRslt.getNameArray();
			MCIndexKey key = sl.createIndex("bp_cd");
			for (MCRow r : auxRslt) {
				if (!isNull(sl.getFirst(key, r.getString("bp_cd")))) {
					continue;
				}
				sl.add().setValuesByName(r, cols);
			}
		}

		//補完する値をキャッシュ
		sloDlvInitCache(sl, bp_is_srch_typ);

		//補完
		for (MCRow r : sl) {
			MAM_CUR_R curR = _bpCache.get(MAM_CUR_R.class, r.getString("cur_cd"));
			MAM_TTERM_R ttm1R = _bpCache.get(MAM_TTERM_R.class,
					r.getString("cst_tterm_cd1"));
			MAM_TTERM_R ttm2R = _bpCache.get(MAM_TTERM_R.class,
					r.getString("cst_tterm_cd2"));
			MAM_TTERM_R ttm3R = _bpCache.get(MAM_TTERM_R.class,
					r.getString("cst_tterm_cd3"));
			MAM_BP_R acstR = _bpCache.get(MAM_BP_R.class, r.getString("acst_cd"));

			r.setStringNE("cur_nm", curR.cur_nm());
			r.setNumberNE("amt_dec_place", curR.amt_dec_place());
			r.setNumberNE("upri_dec_place", curR.upri_dec_place());
			r.setStringNE("cst_tterm_nm1", ttm1R.tterm_nm());
			r.setStringNE("cst_tterm_nm2", ttm2R.tterm_nm());
			r.setStringNE("cst_tterm_nm3", ttm3R.tterm_nm());
			r.setStringNE("acst_nm", acstR.bp_nm());

			if (r.getString("cntry_cd").equals(MAUCL_AppSys.getCo().cntry_cd())) {
				r.setBooleanNE("foreign_flg", false);
			}
			else {
				r.setBooleanNE("foreign_flg", true);
			}
			if (isNull(r.getString("purc_upri_req_typ"))) {
				r.setString("purc_upri_req_typ",
						MAUCL_AppSys.getCo().purc_upri_req_typ());
			}

			if (!r.getBooleanNE("onr_prsppl_flg")) {
				r.setString("outsrc_upri_typ", MAC_OUTSRC_UPRI_TYP.PROC.value());
			}
			else if (isNull(r.getString("outsrc_upri_typ"))) {
				r.setString("outsrc_upri_typ", MAUCL_AppSys.getCo().outsrc_upri_typ());
			}

			// 区分１７：得意先（納品先対応）
			if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {

				MAM_CST_USR_R mawR = _bpCache.get(MAM_CST_USR_R.class, r.getDate("st_dt"),
						r.getString("bp_cd"));
				MAM_BP_R bcstR = _bpCache.get(MAM_BP_R.class, acstR.getString("bcst_cd"));

				r.setStringNE("cst_usr_cd", mawR.getStringNE("usr_cd"));
				r.setStringNE("cst_dpt_cd", mawR.getStringNE("dpt_cd"));
				r.setStringNE("bill_cl_typ", bcstR.bill_cl_typ());
			}
		}
		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
		// 区分１：得意先
		else if (MAC_BP_IS_SRCH_TYP.isCST(bp_is_srch_typ)) {
			sl = getSloDlv_NoDupList(row, builder, t, sl, SloDlvCols.$o_def_dlv_cd);
		}
		// 区分１０：納品先
		else if (MAC_BP_IS_SRCH_TYP.isDLV(bp_is_srch_typ)) {
			sl = getSloDlv_NoDupList(row, builder, t, sl, SloDlvCols.$o_def_cst_cd);
		}
		// 区分１４：得意先（得意先諸口を含まない）
		else if (MAC_BP_IS_SRCH_TYP.isCST_NOT_SUNDRY(bp_is_srch_typ)) {
			sl = getSloDlv_NoDupList(row, builder, t, sl, SloDlvCols.$o_def_dlv_cd);
		}

		// マスタ専用処理
		getSloDlv_AfterSelectMstr(row, builder, t, result, sl);
		
		// 最後に諸口を追加
		addSundryDlvRow(sl);		
		
		return sl;
	}

	/**
	 * 諸口納品先
	 * @param sl
	 */
	private void addSundryDlvRow(MCList<?> sl) {
		MAM_BP_R sundryRow = (MAM_BP_R)sl.add();
		
		sundryRow.bp_cd("99");
		sundryRow.bp_nm("諸口納品先");
		sundryRow.dlv_sundry_flg(true);
		
		sundryRow.addStringColumn("dlv_cd", "99");
		sundryRow.addStringColumn("dlv_nm", "諸口納品先");
	}
	
	protected MCList<?> getSloDlv_AfterSelectMstr(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result, MCList sl) {
		// 手入力時または存在チェック時のみ
		if (row.getBooleanNE(SloDlvCols.$i_check_rem_flg) && isInput(row)) {
			MCRow refRow = sl.createRow();
			if (!isNull(row.getStringNE(SloDlvCols.$i_ref_bp_cd))) {
				refRow.setStringNE(SloDlvCols.$o_bp_cd, row.getString(SloDlvCols.$i_ref_bp_cd));
				sl.add(refRow);
			}
		}
		else if (row.contains(getLLBindNm(SloDlvCols.$i_check_rem_flg))) {
			String[] strs = mcframe.commonCore.lang.MCStringUtil.arrayValueSplit(
					row.getStringNE(getLLBindNm(SloDlvCols.$i_check_rem_flg)));
			String[] remFlgs = new String[strs.length - 1];
			for (int i = 1; i < strs.length; i++) {
				remFlgs[i - 1] = strs[i];
			}
			String[] cd = (String[]) convDataArray(
					row.getStringNE(getLLBindNm(SloDlvCols.$i_ref_bp_cd)));
			for (int i = 0; i < remFlgs.length; i++) {
				if (isSame(remFlgs[i], "1") && !isNull(cd[i])) {
					MCRow refRow = sl.createRow();
					refRow.setStringNE(SloDlvCols.$o_bp_cd, cd[i]);
					sl.add(refRow);
				}
				else if (isSame(remFlgs[i], "0") && !isNull(cd[i])) {
					sl.removeAll(sl.subList(SloDlvCols.$o_bp_cd, cd[i]));
				}
			}
		}
		return sl;
	}
	
	/**
	 * 検索結果にキー（取引先ＣＤ）が重複するレコードが存在している場合、
	 * 対象カラムにnullをセットした上で、重複レコードを１つにまとめたリストを返します。
	 *
	 * @param row 検索条件
	 * @param t DBコンテナ
	 * @param sl 検索結果
	 * @param tarCol 対象カラム
	 * @return 検索結果から重複を除いたリスト
	 */
	protected MCList<?> getSloDlv_NoDupList(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t,
			MCList sl, String tarCol) {
		String keyCol = SloDlvCols.$o_bp_cd;
		String dateCol = SloDlvCols.$o_st_dt;
		// 一時カラムを保持した空のリストを生成
		MCList noDupList = sl.shallowClone();
		noDupList.clear();

		sl.sort(keyCol);
		MCRow pre = null;
		for (Object o : sl) {
			MCRow sr = (MCRow) o;
			if (pre != null && isSame(pre.getStringNE(keyCol), sr.getStringNE(keyCol))
					&& isSame(pre.getDateNE(dateCol), sr.getDateNE(dateCol))) {
				pre.clear(tarCol);
			}
			else {
				noDupList.add(sr);
				pre = sr;
			}
		}
		return noDupList;
	}	
	
	protected DbcCacheMap _bpCache = new DbcCacheMap();

	protected void sloDlvInitCache(MCList<?> bindL, String bp_is_srch_typ) {
		MAM_CUR_R curDbc = MAM_CUR_R.create("T");
		MCQueryApiBuilder bpCurBuilder = MCQueryApiBuilder.create(curDbc);
		bpCurBuilder.setSelect(curDbc.cur_nm, curDbc.amt_dec_place,
				curDbc.upri_dec_place);
		_bpCache.set("MAM_CUR", bpCurBuilder, bindL, "cur_cd");

		MAM_TTERM_R ttm1Dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder ttm1Builder = MCQueryApiBuilder.create(ttm1Dbc);
		ttm1Builder.setSelect(ttm1Dbc.tterm_nm);
		_bpCache.set("MAM_TTERM", ttm1Builder, bindL, "cst_tterm_cd1");

		MAM_TTERM_R ttm2Dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder ttm2Builder = MCQueryApiBuilder.create(ttm2Dbc);
		ttm2Builder.setSelect(ttm2Dbc.tterm_nm);
		_bpCache.set("MAM_TTERM", ttm2Builder, bindL, "cst_tterm_cd2");

		MAM_TTERM_R ttm3Dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder ttm3Builder = MCQueryApiBuilder.create(ttm3Dbc);
		ttm3Builder.setSelect(ttm3Dbc.tterm_nm);
		_bpCache.set("MAM_TTERM", ttm3Builder, bindL, "cst_tterm_cd3");

		MAM_BP_R acstDbc = MAM_BP_R.create("T");
		MCQueryApiBuilder acstBuilder = MCQueryApiBuilder.create(acstDbc);
		acstBuilder.setSelect(acstDbc.bp_cd, acstDbc.bp_nm, acstDbc.bcst_cd,
				acstDbc.bill_cl_typ);
		acstBuilder.setWhere(acstDbc.acst_flg.eq(value(true)));

		_bpCache.set("MAM_BP", acstBuilder, bindL, "acst_cd");

		// 区分１７：得意先（納品先対応）
		if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
			MAM_CST_USR_R cstUsrDbc = MAM_CST_USR_R.create("T");
			MCQueryApiBuilder cstUsrBuilder = MCQueryApiBuilder.create(cstUsrDbc);
			cstUsrBuilder.setSelect(cstUsrDbc.usr_cd, cstUsrDbc.dpt_cd, cstUsrDbc.dpt_cd,
					cstUsrDbc.st_dt);
			FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R> cache = new FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R>(
					cstUsrBuilder, bindL, "bp_cd");
			_bpCache.set("MAM_CST_USR", cache);

			MAM_BP_R bcstDbc = MAM_BP_R.create("T");
			MCQueryApiBuilder bcstBuilder = MCQueryApiBuilder.create(bcstDbc);
			bcstBuilder.setWhere(bcstDbc.bcst_flg.eq(value(true)));

			_bpCache.set("MAM_BP", bcstBuilder, MCList.create(bcstDbc.createInstance()),
					"bcst_cd");
		}
	}	
	
	
	protected void getSloDlv_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result) {

		String srchtyp = row.getStringNE(SloDlvCols.$i_bp_is_srch_typ);

		// MCSQLPluginリソースの設定（ヒント句設定）で使用するバインドの設定
		// 標準設定
		row.setStringNE("default_hint", "true");
		// 区分別設定
		String hintcol = Optional.ofNullable(
				MAC_BP_IS_SRCH_TYP.getNE(srchtyp))
				.map(st -> st.key()).orElse("");
		row.setStringNE(hintcol + "_hint", "true");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addNumberColumn(SloDlvCols.$o_amt_dec_place);
		result.addNumberColumn(SloDlvCols.$o_upri_dec_place);
		result.addBooleanColumn(SloDlvCols.$o_foreign_flg);
		result.addDateColumn(SloDlvCols.$o_st_dt);
		result.addDateColumn(SloDlvCols.$o_end_dt);
		result.addStringColumn(SloDlvCols.$o_purc_usr_cd);
		result.addStringColumn(SloDlvCols.$o_purc_dpt_cd);
		result.addStringColumn(SloDlvCols.$o_dlv_cd);
		result.addStringColumn(SloDlvCols.$o_def_dlv_cd);
		result.addStringColumn(SloDlvCols.$o_cst_usr_cd);
		result.addStringColumn(SloDlvCols.$o_cst_dpt_cd);
		result.addStringColumn(SloDlvCols.$o_cst_cd);
		result.addStringColumn(SloDlvCols.$o_def_cst_cd);
		result.addBooleanColumn(SloDlvCols.$o_edi_po_send_tgt_flg);
		result.addBooleanColumn(SloDlvCols.$o_edi_accpt_send_tgt_flg);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm1);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm2);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm3);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm4);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm5);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm6);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm7);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm8);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm9);
		result.addStringColumn(SloDlvCols.$o_bp_grp_nm10);

		// Select句、結合の設定
		// _bpCacheで取得するためremove
		builder.removeSelect(MAM_BP_R.$cur_nm);
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm1);
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm2);
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm3);
		builder.removeSelect(MAM_BP_R.$acst_nm);
		builder.removeSelect(MAM_BP_R.$bcst_nm);
		builder.removeSelect(MAM_BP_R.$ap_dpt_cd);
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$cur_nm));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$cst_tterm_nm1));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$cst_tterm_nm2));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$cst_tterm_nm3));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$acst_nm));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$bcst_nm));
		
		// 取引先補助マスタから取得するためremove
		builder.removeSelect(MAM_BP_R.$zip_cd);
		builder.removeSelect(MAM_BP_R.$addr1);
		builder.removeSelect(MAM_BP_R.$addr2);
		builder.removeSelect(MAM_BP_R.$addr3);
		builder.removeSelect(MAM_BP_R.$addr4);
		builder.removeSelect(MAM_BP_R.$tel);
		builder.removeSelect(MAM_BP_R.$fax);
		builder.removeSelect(MAM_BP_R.$ap_dpt_cd);
		builder.removeSelect(MAM_BP_R.$ar_dpt_cd);
		builder.removeSelect(MAM_BP_R.$bsppl_dpt_cd);
		builder.removeSelect(MAM_BP_R.$pay_dpt_cd);
		builder.removeSelect(MAM_BP_R.$cst_cntct_dpt);
		builder.removeSelect(MAM_BP_R.$cst_cntct_psn);
		builder.removeSelect(MAM_BP_R.$sppl_cntct_dpt);
		builder.removeSelect(MAM_BP_R.$sppl_cntct_psn);
		builder.removeSelect(MAM_BP_R.$dlv_cntct_dpt);
		builder.removeSelect(MAM_BP_R.$dlv_cntct_psn);
		
		// Z項目を使用してselectとJoin を追加
		builder.addSelect(MAM_BP_R.$cntry_nm, t.getColumn$(MAM_BP_R.$cntry_nm));
		builder.addSelect(MAM_BP_R.$area_nm, t.getColumn$(MAM_BP_R.$area_nm));
		getSloDlv_addSelectJoinWk(row, builder, t, result);
		getSloDlv_addSelectJoinBpSub(row, builder, t, result);
		getSloDlv_addSelectJoinByBpIsSrchTyp(row, builder, t, result,
				row.getStringNE(SloDlvCols.$i_bp_is_srch_typ));

		// リストロジックチェック時 
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}

		// 入力補助画面からのリスト取得時
		setSelectJoinOfBpGrpForBp(row, builder);
	}
	
	protected void getSloDlv_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t,
			MCList<?> result) {
		MAW_BP_LL_R w = MAW_BP_LL_R.create("W");

		// ワークテーブルを作成＋結合
		MCList<MAW_BP_LL_R> dcL = MCList.create(MAW_BP_LL_R.class);
		String delId = createSqlId("MA.MAUAL0010.Bp_getBp_addSelectJoinWk",
				dcL.createRow(), "D01");
		execDbWkDelete(delId, MAW_BP_LL_R.create());
		String insId = createSqlId("MA.MAUAL0010.Bp_getBp_addSelectJoinWk",
				dcL.createRow(), "I01");
		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(dcL.createRow());
		insBuilder.setValuesAll();
		String[] bpCd = null;
		MCDate[] dt = null;
		String[] dlvCd = null;
		String[] cstCd = null;
		String[] bspplCd = null;
		if (isSrvChk(row)) {
			String bp_is_srch_typ = row.getStringNE(SloDlvCols.$i_bp_is_srch_typ);
			boolean containDt = row.contains(getLLBindNm(SloDlvCols.$i_dt));

			bpCd = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
			// 適用日が指定されている場合
			if (containDt) {
				dt = (MCDate[]) convDataArray(row.getStringNE(getLLBindNm(SloDlvCols.$i_dt)));
			}
			// 区分１７：得意先（納品先対応）
			if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
				dlvCd = (String[]) convDataArray(
						row.getStringNE(getLLBindNm(SloDlvCols.$i_dlv_cd)));
			}
			// 区分１８：納品先（得意先対応）
			if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(bp_is_srch_typ)) {
				cstCd = (String[]) convDataArray(
						row.getStringNE(getLLBindNm(SloDlvCols.$i_cst_cd)));
			}
			// 区分３０：債務相殺先
			if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(bp_is_srch_typ)) {
				bspplCd = (String[]) convDataArray(
						row.getStringNE(getLLBindNm(SloDlvCols.$i_bsppl_cd)));
			}

			for (int i = 0; i < bpCd.length; i++) {
				MAW_BP_LL_R dcR = MAW_BP_LL_R.create();
				dcR.bp_cd(bpCd[i]);
				// 適用日が指定されている場合
				if (containDt) {
					dcR.dt(dt[i]);
				}
				// 区分１７：得意先（納品先対応）
				if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
					dcR.dlv_cd(dlvCd[i]);
				}
				// 区分１８：納品先（得意先対応）
				if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(bp_is_srch_typ)) {
					dcR.cst_cd(cstCd[i]);
				}
				// 区分３０：債務相殺先
				if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(bp_is_srch_typ)) {
					dcR.bsppl_cd(bspplCd[i]);
				}
				dcL.add(dcR);
			}
			dbInsert(insId, dcL, insBuilder);

			// ワークテーブルと結合したSELECT句を追加
			builder.addSelect(w.dlv_cd); // リストロジックチェックで使用
			builder.addSelect(w.cst_cd); // リストロジックチェックで使用
			builder.addSelect(w.dt.as("st_dt"));
			builder.addSelect(w.dt.as("end_dt"));
			builder.addInnerJoin(w, w.bp_cd.eq(t.bp_cd));
		}
		else {
			MAW_BP_LL_R dcR = MAW_BP_LL_R.create();
			dcR.dlv_cd(row.getStringNE(SloDlvCols.$i_dlv_cd));
			dcR.cst_cd(row.getStringNE(SloDlvCols.$i_cst_cd));
			dcR.bsppl_cd(row.getStringNE(SloDlvCols.$i_bsppl_cd));
			dcR.dt(row.getDateNE(SloDlvCols.$i_dt));
			dcL.add(dcR);
			dbInsert(insId, dcL, insBuilder);

			builder.addSelect(w.dt.as("st_dt"));
			builder.addSelect(w.dt.as("end_dt"));

			// ワークテーブルと結合したSELECT句を追加
			builder.addLeftOuterJoin(w, value(0).eq(value(0)));
		}
	}	
	
	/**
	 * @param row
	 * @param builder
	 * @param t
	 */
	protected void getSloDlv_addSelectJoinBpSub(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result) {
		if (hasDt(row, SloDlvCols.$i_dt)) {
			MAW_BP_LL_R w = MAW_BP_LL_R.create("W");
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"));
			builder.addSelect(MAPA_BP$F_GET_AR_DPT_CD_NE(t.bp_cd, w.dt, value(false))
					.as("ar_dpt_cd"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.CST_CNTCT_DPT.value())).as("cst_cntct_dpt"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.CST_CNTCT_PSN.value())).as("cst_cntct_psn"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())).as("sppl_cntct_dpt"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())).as("sppl_cntct_psn"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())).as("dlv_cntct_dpt"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())).as("dlv_cntct_psn"));
			builder.addSelect(MAPA_BP$F_GET_BSPPL_DPT_CD_NE(t.bp_cd, w.dt, value(false))
					.as("bsppl_dpt_cd"));
			builder.addSelect(MAPA_BP$F_GET_PAY_DPT_CD_NE(t.bp_cd, w.dt, value(false))
					.as("pay_dpt_cd"));
		}
	}
	
	protected void getSloDlv_addSelectJoinByBpIsSrchTyp(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result, String bp_is_srch_typ) {
		MAM_BP_R baseDbc = (MAM_BP_R) builder.getBaseDbc();
		MAW_BP_LL_R w = MAW_BP_LL_R.create("W");
		MAM_CST_DLV_R cst_dlv = MAM_CST_DLV_R.create("CST_DLV");
		MAM_CST_USR_R cst_usr = MAM_CST_USR_R.create("CST_USR");
		MAM_SPPL_USR_R sppl_usr = MAM_SPPL_USR_R.create("SPPL_USR");
		MAM_BP_R dlv = MAM_BP_R.create("DLV");
		MAM_BP_R acst = MAM_BP_R.create("ACST");
		MAM_BP_R bcst = MAM_BP_R.create("BCST");
		MAM_BP_R asppl = MAM_BP_R.create("ASPPL");
		MAM_BP_R bsppl = MAM_BP_R.create("BSPPL");
		MAM_BP_R cst = MAM_BP_R.create("CST");
		MAM_EDI_IF_CTL_R ifctl_po = MAM_EDI_IF_CTL_R.create("IFCTL_PO");
		MAM_EDI_IF_CTL_R ifctl_accpt = MAM_EDI_IF_CTL_R.create("IFCTL_ACCPT");
		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
		// 区分１：得意先
		else if (MAC_BP_IS_SRCH_TYP.isCST(bp_is_srch_typ)) {
			// 日付は任意
			if (hasDt(row, SloDlvCols.$i_dt)) {
				builder.addSelect(cst_usr.usr_cd.as("cst_usr_cd"),
						cst_usr.dpt_cd.as("cst_dpt_cd"),
						nvl(cst_dlv.dlv_cd, dlv.bp_cd).as("def_dlv_cd"))
						.addLeftOuterJoin(cst_dlv,
								cst_dlv.cst_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)))
						.addLeftOuterJoin(cst_usr,
								cst_usr.cst_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_usr.st_dt, cst_usr.end_dt)))
						.addLeftOuterJoin(dlv, dlv.bp_cd.eq(baseDbc.bp_cd)
								.and(dlv.dlv_flg.eq(value(true))));
			}
		}
		// 区分２：売掛先
		else if (MAC_BP_IS_SRCH_TYP.isACST(bp_is_srch_typ)) {
			builder.addSelect(MAM_BP_R.$bcst_nm, t.getColumn$(MAM_BP_R.$bcst_nm));
		}
		// 区分５：発注先
		else if (MAC_BP_IS_SRCH_TYP.isSPPL(bp_is_srch_typ)) {
			// 日付は任意
			if (hasDt(row, SloDlvCols.$i_dt)) {
				builder.addSelect(sppl_usr.purc_usr_cd, sppl_usr.purc_dpt_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(baseDbc.asppl_cd, w.dt, value(false))
								.as("ap_dpt_cd"))
						.addLeftOuterJoin(sppl_usr, sppl_usr.sppl_cd.eq(baseDbc.bp_cd)
								.and(w.dt.between(sppl_usr.st_dt, sppl_usr.end_dt)));
			}
			String $ediToday = "edi_today";
			row.addDateColumn($ediToday, getToday());
			builder.addSelect(cases().when(ifctl_po.if_proc_typ.isNull())
					.then(value(false)).otherwise(value(true)).as("edi_po_send_tgt_flg"));
			builder.addLeftOuterJoin(ifctl_po, t.bp_cd.eq(ifctl_po.bp_cd)
					.and(bind("edi_today").between(ifctl_po.st_dt, ifctl_po.end_dt))
					.and(ifctl_po.if_proc_typ
							.eq(value(MAC_IF_PROC_TYP.PO_SEND.value()))));
			builder.addSelect(
					cases().when(ifctl_accpt.if_proc_typ.isNull()).then(value(false))
							.otherwise(value(true)).as("edi_accpt_send_tgt_flg"));
			builder.addLeftOuterJoin(ifctl_accpt, t.bp_cd.eq(ifctl_accpt.bp_cd)
					.and(bind("edi_today").between(ifctl_accpt.st_dt, ifctl_accpt.end_dt))
					.and(ifctl_accpt.if_proc_typ
							.eq(value(MAC_IF_PROC_TYP.ACCPT_SEND.value()))));
		}
		//　区分２８：発注先_購買
		else if (MAC_BP_IS_SRCH_TYP.isSPPL_PURC(bp_is_srch_typ)) {
			// 日付は任意
			if (hasDt(row, SloDlvCols.$i_dt)) {
				builder.addSelect(sppl_usr.purc_usr_cd, sppl_usr.purc_dpt_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(baseDbc.asppl_cd, w.dt, value(false))
								.as("ap_dpt_cd"))
						.addLeftOuterJoin(sppl_usr, sppl_usr.sppl_cd.eq(baseDbc.bp_cd)
								.and(w.dt.between(sppl_usr.st_dt, sppl_usr.end_dt)));
			}
			builder.removeSelect(MAM_BP_R.$pay_spot_flg).addSelect(bsppl.pay_spot_flg)
					.addLeftOuterJoin(asppl,
							asppl.bp_cd.eq(baseDbc.asppl_cd)
									.and(asppl.asppl_flg.eq(value(true))))
					.addLeftOuterJoin(bsppl, bsppl.bp_cd.eq(asppl.bsppl_cd)
							.and(bsppl.bsppl_flg.eq(value(true))));
		}
		// 区分１０：納品先
		else if (MAC_BP_IS_SRCH_TYP.isDLV(bp_is_srch_typ)) {
			// 日付は任意
			if (!isSrvChk(row) && hasDt(row, SloDlvCols.$i_dt)) {
				builder.addSelect(nvl(cst_dlv.cst_cd, cst.bp_cd).as("def_cst_cd"))
						.addLeftOuterJoin(cst_dlv,
								cst_dlv.dlv_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)))
						.addLeftOuterJoin(cst, cst.bp_cd.eq(baseDbc.bp_cd)
								.and(cst.cst_flg.eq(value(true))));
			}
		}
		// 区分１４：得意先（得意先諸口を含まない）
		else if (MAC_BP_IS_SRCH_TYP.isCST_NOT_SUNDRY(bp_is_srch_typ)) {
			// 日付は任意
			if (hasDt(row, SloDlvCols.$i_dt)) {
				builder.addSelect(cst_usr.usr_cd.as("cst_usr_cd"))
						.addSelect(cst_usr.dpt_cd.as("cst_dpt_cd"))
						.addSelect(nvl(cst_dlv.dlv_cd, dlv.bp_cd).as("def_dlv_cd"))
						.addLeftOuterJoin(cst_dlv,
								cst_dlv.cst_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)))
						.addLeftOuterJoin(cst_usr,
								cst_usr.cst_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_usr.st_dt, cst_usr.end_dt)))
						.addLeftOuterJoin(dlv, dlv.bp_cd.eq(baseDbc.bp_cd)
								.and(dlv.dlv_flg.eq(value(true))));
			}
			builder.removeSelect(MAM_BP_R.$bill_cl_typ).addSelect(bcst.bill_cl_typ)
					.addLeftOuterJoin(acst,
							acst.bp_cd.eq(baseDbc.acst_cd)
									.and(acst.acst_flg.eq(value(true))))
					.addLeftOuterJoin(bcst, bcst.bp_cd.eq(acst.bcst_cd)
							.and(bcst.bcst_flg.eq(value(true))));
		}
		// 区分１７：得意先（納品先対応）
		else if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
			// 日付は必須
			if (_cstdlv_sql == 0) {
				builder.addLeftOuterJoin(cst_dlv, cst_dlv.cst_cd.eq(baseDbc.bp_cd)
						.and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)));
			}
		}
		// 区分１８：納品先（得意先対応）
		else if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(bp_is_srch_typ)) {
			// 日付は必須
			builder.setDistinct().addLeftOuterJoin(cst_dlv, cst_dlv.dlv_cd
					.eq(baseDbc.bp_cd).and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)));
		}
		// 区分３０：債務相殺先
		else if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(bp_is_srch_typ)) {
			builder.setDistinct()
					.addInnerJoin(bcst,
							baseDbc.bcst_cd.eq(bcst.bp_cd)
									.and(bcst.bcst_flg.eq(value(true))))
					.addLeftOuterJoin(bsppl,
							bcst.ar_setoff_grp_cd.eq(bsppl.ap_setoff_grp_cd)
									.and(bsppl.bsppl_flg.eq(value(true))));
		}
	}
	
	protected void getSloDlv_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t,
			MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		String srch_typ = row.getStringNE(SloDlvCols.$i_bp_is_srch_typ);
		getBp_addWhereByBpIsSrchTyp(row, builder, t, result, srch_typ);
		if (row.getBooleanNE(SloDlvCols.$i_foreign_flg)) {
			builder.addWhereWithCutOffAnd(t.cntry_cd.neq(bind("1")),
					MAUCL_AppSys.getCo().cntry_cd());
		}

		// リストロジックチェック時はこれ以上の条件を追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		// 債権債務先識別区分
		getBp_addWhereByBpIsSrchTyp(row, builder, t, result, MAC_DEBT_CRED_ID_TYP
				.bp_is_srch_typ(row.getStringNE(SloDlvCols.$i_debt_cred_id_typ)));

		String bp_is_srch_typ = row.getStringNE(SloDlvCols.$i_bp_is_srch_typ);
		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
		// 区分１９：請求先（入金先対応）
		else if (MAC_BP_IS_SRCH_TYP.isBCST_BY_RCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.rcst_cd.eq(bind("1")).or(t.bp_cd.eq(bind("1"))),
					row.getStringNE(SloDlvCols.$i_in_rcst_cd));
		}

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}

		// 入力補助画面の条件
		addWhereByBpFlg(row, builder);
		builder.addWhereWithCutOffAnd(t.bp_cd.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_cd));
		builder.addWhereWithCutOffAnd(t.bp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_nm));
		builder.addWhereWithCutOffAnd(t.ein.like(bind("1")),
				getEditString(row, SloDlvCols.$i_ein));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm1.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_alt_nm1));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm2.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_alt_nm2));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm3.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_alt_nm3));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm4.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_alt_nm4));
		builder.addWhereWithCutOffAnd(t.cntry_cd.like(bind("1")),
				getEditString(row, SloDlvCols.$i_cntry_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn) t.getColumn$("cntry_nm")).like(bind("1")),
				getEditString(row, SloDlvCols.$i_cntry_nm));
		builder.addWhereWithCutOffAnd(t.area_cd.like(bind("1")),
				getEditString(row, SloDlvCols.$i_area_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn) t.getColumn$("area_nm")).like(bind("1")),
				getEditString(row, SloDlvCols.$i_area_nm));
		builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo1));
		builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo2));
		builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo3));
		builder.addWhereWithCutOffAnd(t.memo4.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo4));
		builder.addWhereWithCutOffAnd(t.memo5.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo5));
		builder.addWhereWithCutOffAnd(t.memo6.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo6));
		builder.addWhereWithCutOffAnd(t.memo7.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo7));
		builder.addWhereWithCutOffAnd(t.memo8.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo8));
		builder.addWhereWithCutOffAnd(t.memo9.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo9));
		builder.addWhereWithCutOffAnd(t.memo10.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo10));
		builder.addWhereWithCutOffAnd(t.memo11.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo11));
		builder.addWhereWithCutOffAnd(t.memo12.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo12));
		builder.addWhereWithCutOffAnd(t.memo13.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo13));
		builder.addWhereWithCutOffAnd(t.memo14.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo14));
		builder.addWhereWithCutOffAnd(t.memo15.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo15));
		builder.addWhereWithCutOffAnd(t.memo16.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo16));
		builder.addWhereWithCutOffAnd(t.memo17.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo17));
		builder.addWhereWithCutOffAnd(t.memo17.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo17));
		builder.addWhereWithCutOffAnd(t.memo18.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo18));
		builder.addWhereWithCutOffAnd(t.memo19.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo19));
		builder.addWhereWithCutOffAnd(t.memo20.like(bind("1")),
				getEditString(row, SloDlvCols.$i_memo20));

		// getBp_adddSelectJoinCustom でJoinされる。Joinしていないwhere句はカットオフで消去される前提。
		MAM_BP_GRP_R grp1 = MAM_BP_GRP_R.create("GRP1");
		MAM_BP_GRP_R grp2 = MAM_BP_GRP_R.create("GRP2");
		MAM_BP_GRP_R grp3 = MAM_BP_GRP_R.create("GRP3");
		MAM_BP_GRP_R grp4 = MAM_BP_GRP_R.create("GRP4");
		MAM_BP_GRP_R grp5 = MAM_BP_GRP_R.create("GRP5");
		MAM_BP_GRP_R grp6 = MAM_BP_GRP_R.create("GRP6");
		MAM_BP_GRP_R grp7 = MAM_BP_GRP_R.create("GRP7");
		MAM_BP_GRP_R grp8 = MAM_BP_GRP_R.create("GRP8");
		MAM_BP_GRP_R grp9 = MAM_BP_GRP_R.create("GRP9");
		MAM_BP_GRP_R grp10 = MAM_BP_GRP_R.create("GRP10");

		builder.addWhereWithCutOffAnd(t.bp_grp_cd1.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd1));
		builder.addWhereWithCutOffAnd(grp1.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm1));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd2.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd2));
		builder.addWhereWithCutOffAnd(grp2.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm2));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd3.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd3));
		builder.addWhereWithCutOffAnd(grp3.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm3));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd4.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd4));
		builder.addWhereWithCutOffAnd(grp4.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm4));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd5.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd5));
		builder.addWhereWithCutOffAnd(grp5.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm5));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd6.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd6));
		builder.addWhereWithCutOffAnd(grp6.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm6));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd7.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd7));
		builder.addWhereWithCutOffAnd(grp7.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm7));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd8.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd8));
		builder.addWhereWithCutOffAnd(grp8.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm8));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd9.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd9));
		builder.addWhereWithCutOffAnd(grp9.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm9));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd10.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_cd10));
		builder.addWhereWithCutOffAnd(grp10.bp_grp_nm.like(bind("1")),
				getEditString(row, SloDlvCols.$i_bp_grp_nm10));
	}	
	
	protected void getBp_addWhereByBpIsSrchTyp(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result, String bp_is_srch_typ) {
		MAM_BP_ITM_R bi = MAM_BP_ITM_R.create("BI");
		MAW_BP_LL_R w = MAW_BP_LL_R.create("W");
		MAM_CST_DLV_R cst_dlv = MAM_CST_DLV_R.create("CST_DLV");
		MAM_BP_R bsppl = MAM_BP_R.create("BSPPL");
		MAM_BP_R bcst = MAM_BP_R.create("BCST");
		// 固定条件のみ実装

		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
		// 区分１：得意先
		else if (MAC_BP_IS_SRCH_TYP.isCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(true)));
			if (row.contains(SloDlvCols.$i_cst_iv_flg)) {
				builder.addWhereWithAnd(t.cst_iv_flg.eq(bind("1")),
						booleanToDBString(row.getBooleanNE(SloDlvCols.$i_cst_iv_flg)));
			}
		}
		// 区分２：売掛先
		else if (MAC_BP_IS_SRCH_TYP.isACST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.acst_flg.eq(value(true)));
		}
		// 区分３：請求先
		else if (MAC_BP_IS_SRCH_TYP.isBCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.bcst_flg.eq(value(true)));
		}
		// 区分４：入金先
		else if (MAC_BP_IS_SRCH_TYP.isRCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.rcst_flg.eq(value(true)));
		}
		// 区分５：発注先
		else if (MAC_BP_IS_SRCH_TYP.isSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		}
		// 区分６：買掛先
		else if (MAC_BP_IS_SRCH_TYP.isASPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.asppl_flg.eq(value(true)));
		}
		// 区分７：支払予定管理先
		else if (MAC_BP_IS_SRCH_TYP.isBSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(true)));
		}
		// 区分８：支払先
		else if (MAC_BP_IS_SRCH_TYP.isPSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.psppl_flg.eq(value(true)));
		}
		// 区分９：与信管理先
		else if (MAC_BP_IS_SRCH_TYP.isCRED(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cred_flg.eq(value(true)));
		}
		// 区分１０：納品先
		else if (MAC_BP_IS_SRCH_TYP.isDLV(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.dlv_flg.eq(value(true)));
		}
		// 区分１１：メーカ
		else if (MAC_BP_IS_SRCH_TYP.isMAKER(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.maker_flg.eq(value(true)));
		}
		// 区分１２：仕向先
		else if (MAC_BP_IS_SRCH_TYP.isDEST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.dest_flg.eq(value(true)));
		}
		// 区分１３：得意先または発注先
		else if (MAC_BP_IS_SRCH_TYP.isCST_SPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(
					t.cst_flg.eq(value(true)).or(t.sppl_flg.eq(value(true))));
		}
		// 区分１４：得意先（得意先諸口を含まない）
		else if (MAC_BP_IS_SRCH_TYP.isCST_NOT_SUNDRY(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(true)));
			builder.addWhereWithAnd(t.cst_sundry_flg.eq(value(false)));
			if (row.contains(SloDlvCols.$i_cst_iv_flg)) {
				builder.addWhereWithAnd(t.cst_iv_flg.eq(bind("1")),
						booleanToDBString(row.getBooleanNE(SloDlvCols.$i_cst_iv_flg)));
			}
		}
		// 区分１５：配送先
		else if (MAC_BP_IS_SRCH_TYP.isTDLV(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.tdlv_flg.eq(value(true)));
		}
		// 区分１６：有償支給先
		else if (MAC_BP_IS_SRCH_TYP.isONR_PRSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.onr_prsppl_flg.eq(value(true)));
			builder.addWhereWithAnd(t.cst_flg.eq(value(true))
					.or(t.cst_flg.eq(value(true))).or(t.acst_flg.eq(value(true)))
					.or(t.bcst_flg.eq(value(true))).or(t.rcst_flg.eq(value(true)))
					.or(t.sppl_flg.eq(value(true))).or(t.asppl_flg.eq(value(true)))
					.or(t.bsppl_flg.eq(value(true))).or(t.psppl_flg.eq(value(true)))
					.or(t.cred_flg.eq(value(true))).or(t.dlv_flg.eq(value(true)))
					.or(t.maker_flg.eq(value(true))).or(t.dest_flg.eq(value(true)))
					.or(t.tdlv_flg.eq(value(true))));
		}
		// 区分１７：得意先（納品先対応）
		else if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
			if (!row.getBooleanNE(SloDlvCols.$i_cst_sundry_cntn_flg)) {
				builder.addWhereWithAnd(t.cst_sundry_flg.eq(value(false)));
			}
			if (row.contains(SloDlvCols.$i_cst_iv_flg)) {
				builder.addWhereWithAnd(t.cst_iv_flg.eq(bind("1")),
						booleanToDBString(row.getBooleanNE(SloDlvCols.$i_cst_iv_flg)));
			}
			if (_cstdlv_sql == 0) {
				builder.addWhereWithAnd(cst_dlv.dlv_cd.eq(w.dlv_cd));
			}
			else {
				builder.addWhereWithAnd(
						t.bp_cd.eq(w.dlv_cd).and(t.cst_flg.eq(value(true))));
			}
		}
		// 区分１８：納品先（得意先対応）
		else if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(cst_dlv.cst_cd.eq(w.cst_cd)
					.or(t.bp_cd.eq(w.cst_cd).and(t.dlv_flg.eq(value(true)))));
		}
		// 区分１９：請求先（入金先対応）
		else if (MAC_BP_IS_SRCH_TYP.isBCST_BY_RCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.bcst_flg.eq(value(true)));
		}
		// 区分２０：納品先のみ
		else if (MAC_BP_IS_SRCH_TYP.isDLV_ONLY(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.acst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.rcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dlv_flg.eq(value(true)));
			builder.addWhereWithAnd(t.dest_flg.eq(value(false)));
			builder.addWhereWithAnd(t.cred_flg.eq(value(false)));
			builder.addWhereWithAnd(t.sppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.asppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.psppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.maker_flg.eq(value(false)));
		}
		// 区分２１：メーカのみ
		else if (MAC_BP_IS_SRCH_TYP.isMAKER_ONLY(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.acst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.rcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dlv_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dest_flg.eq(value(false)));
			builder.addWhereWithAnd(t.cred_flg.eq(value(false)));
			builder.addWhereWithAnd(t.sppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.asppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.psppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.maker_flg.eq(value(true)));
			builder.addWhereWithAnd(t.tdlv_flg.eq(value(false)));
		}
		// 区分２２：仕向先のみ
		else if (MAC_BP_IS_SRCH_TYP.isDEST_ONLY(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.acst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.rcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dlv_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dest_flg.eq(value(true)));
			builder.addWhereWithAnd(t.cred_flg.eq(value(false)));
			builder.addWhereWithAnd(t.sppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.asppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.psppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.maker_flg.eq(value(false)));
			builder.addWhereWithAnd(t.tdlv_flg.eq(value(false)));
		}
		// 区分２３：納品先または発注先
		else if (MAC_BP_IS_SRCH_TYP.isDLV_SPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(
					t.dlv_flg.eq(value(true)).or(t.sppl_flg.eq(value(true))));
		}
		// 区分２４：購買内示
		else if (MAC_BP_IS_SRCH_TYP.isPURC_FRCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
			builder.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(bi).where(value(0).eq(value(0))
							.and(bi.bp_cd.eq(t.bp_cd)).and(bi.pf_grp_cd.isNotNull()))));
		}
		// 区分２５：請求先または入金先
		else if (MAC_BP_IS_SRCH_TYP.isBCST_RCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(
					t.bcst_flg.eq(value(true)).or(t.rcst_flg.eq(value(true))));
		}
		// 区分２６：得意先または納品先または発注先
		else if (MAC_BP_IS_SRCH_TYP.isCST_DLV_SPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(true))
					.or(t.dlv_flg.eq(value(true))).or(t.sppl_flg.eq(value(true))));
		}
		// 区分２７：インボイス取引対象発注先ではない
		else if (MAC_BP_IS_SRCH_TYP.isNOT_SPPL_IV(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		}
		// 区分２８：発注先_購買
		else if (MAC_BP_IS_SRCH_TYP.isSPPL_PURC(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		}
		// 区分２９：支払予定管理先または支払先
		else if (MAC_BP_IS_SRCH_TYP.isBSPPL_PSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(
					t.bsppl_flg.eq(value(true)).or(t.psppl_flg.eq(value(true))));
		}
		// 区分３０：債務相殺先
		else if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.acst_flg.eq(value(true)));
			builder.addWhereWithAnd(
					w.bsppl_cd.eq(bsppl.bp_cd).or(w.bsppl_cd.eq(bcst.bp_cd)));
		}
		// 区分３１：得意先または発注先または請求先または支払予定管理先
		else if (MAC_BP_IS_SRCH_TYP.isCST_SPPL_BILL_BSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(true))
					.or(t.sppl_flg.eq(value(true))
					.or(t.bcst_flg.eq(value(true)))
					.or(t.bsppl_flg.eq(value(true)))));
		}
	}
	
	
	
}