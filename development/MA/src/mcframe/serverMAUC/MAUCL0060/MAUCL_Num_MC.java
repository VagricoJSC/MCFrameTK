package mcframe.serverMAUC.MAUCL0060;

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
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverCore.requester.MCRequestObject.*;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_Num"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_Num_MC extends MAUCL_Num_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MAUCL_Num> CLAZZ = MAUCL_Num.class;
	
	/**
	 * 発番処理を実行します（static method）<p>
	 * 引数argsの状態は変更しません。<br>
	 * num_ptn_cdがnullの場合は、MAC_STR.DEF_NUM_PTN_CDを使用します。
	 * @param num_biz_typ 発番業務区分
	 * @param args 発番処理に必要な要素引数
	 * @return 発番結果
	 */
	public static String getNum(MAC_NUM_BIZ_TYP num_biz_typ, ElmArgsR args) {
		
		return object(CLAZZ)._getNum(num_biz_typ, args);
	}

	/**
	 * {@link #getNum(MAC_NUM_BIZ_TYP, ElmArgsR)}
	 */
	protected String _getNum(MAC_NUM_BIZ_TYP num_biz_typ, ElmArgsR args) {
		ElmArgsR a = args.clone();
		a.num_ptn_cd(nvl(a.num_ptn_cd(), MAC_STR.DEF_NUM_PTN_CD.value()));
		a.peg_no(MCNumber.ONE);
		MCList<ElmArgsR> l = MCList.create(ElmArgsR.class);
		l.add(a);
		MCList<MAW_NUM_ARG_R> ret = _getNum(num_biz_typ, l);
		if (!isNull(ret)) {
			return ret.get(0).new_no();
		}
		return null;
	}
	
	/**
	 * 一括発番処理を実行します。<br>
	 * peg_noには一意の値を設定してください。<br>
	 * peg_noと発番したＮＯは、戻り値のpeg_noとnew_noに設定されます。
	 * 引数argsの状態は変更しません。
	 * @param num_biz_typ 発番業務区分
	 * @param args 発番要素
	 * @return 発番結果を保持するリスト
	 */
	protected MCList<MAW_NUM_ARG_R> _getNum(MAC_NUM_BIZ_TYP num_biz_typ, MCList<ElmArgsR> args) {
		// MAW_NUM_ARGに発番対象を登録する
		MAW_NUM_ARG_R S0 = MAW_NUM_ARG_R.create();
		String sqlid_wk_d = createSqlId(LOGIC_ID, S0, "D01");
		String sqlid_wk_i = createSqlId(LOGIC_ID, S0, "I01");
		String sqlid_wk_s = createSqlId(LOGIC_ID, S0, "S01");
		
		execDbWkDelete(sqlid_wk_d, S0);
		sql(sqlid_wk_i)
			.insert(S0)
			.columns(
				S0.num_ptn_cd,
				S0.peg_no,
				S0.itm_cd,
				S0.itm_sub1,
				S0.itm_sub2,
				S0.itm_sub3,
				S0.loc_cd,
				S0.dpt_cd,
				S0.co_cd,
				S0.bp_cd,
				S0.wg_cd,
				S0.trd_cd,
				S0.site_cd,
				S0.lot_no,
				S0.chd_lot_no,
				S0.chd_sublot_no,
				S0.bp_lot_no,
				S0.sno1,
				S0.sno2,
				S0.sno3,
				S0.sno4,
				S0.dt,
				S0.str,
				S0.str2,
				S0.str3,
				S0.num,
				S0.itm_cd_label_nm,
				S0.itm_sub1_label_nm,
				S0.itm_sub2_label_nm,
				S0.itm_sub3_label_nm,
				S0.loc_cd_label_nm,
				S0.dpt_cd_label_nm,
				S0.co_cd_label_nm,
				S0.bp_cd_label_nm,
				S0.wg_cd_label_nm,
				S0.site_cd_label_nm,
				S0.lot_no_label_nm,
				S0.chd_lot_no_label_nm,
				S0.chd_sublot_no_label_nm,
				S0.bp_lot_no_label_nm,
				S0.sno1_label_nm,
				S0.sno2_label_nm,
				S0.sno3_label_nm,
				S0.sno4_label_nm,
				S0.trd_cd_label_nm,
				S0.dt_label_nm,
				S0.str_label_nm,
				S0.str2_label_nm,
				S0.str3_label_nm,
				S0.num_label_nm
			)
			.values(
				bind("num_ptn_cd"),
				bind("peg_no"),
				bind("itm_cd"),
				bind("itm_sub1"),
				bind("itm_sub2"),
				bind("itm_sub3"),
				bind("loc_cd"),
				bind("dpt_cd"),
				bind("co_cd"),
				bind("bp_cd"),
				bind("wg_cd"),
				bind("trd_cd"),
				bind("site_cd"),
				bind("lot_no"),
				bind("chd_lot_no"),
				bind("chd_sublot_no"),
				bind("bp_lot_no"),
				bind("sno1"),
				bind("sno2"),
				bind("sno3"),
				bind("sno4"),
				bind("dt"),
				bind("str"),
				bind("str2"),
				bind("str3"),
				bind("num"),
				bind("itm_cd_label_nm"),
				bind("itm_sub1_label_nm"),
				bind("itm_sub2_label_nm"),
				bind("itm_sub3_label_nm"),
				bind("loc_cd_label_nm"),
				bind("dpt_cd_label_nm"),
				bind("co_cd_label_nm"),
				bind("bp_cd_label_nm"),
				bind("wg_cd_label_nm"),
				bind("site_cd_label_nm"),
				bind("lot_no_label_nm"),
				bind("chd_lot_no_label_nm"),
				bind("chd_sublot_no_label_nm"),
				bind("bp_lot_no_label_nm"),
				bind("sno1_label_nm"),
				bind("sno2_label_nm"),
				bind("sno3_label_nm"),
				bind("sno4_label_nm"),
				bind("trd_cd_label_nm"),
				bind("dt_label_nm"),
				bind("str_label_nm"),
				bind("str2_label_nm"),
				bind("str3_label_nm"),
				bind("num_label_nm")
			).executeBatchUpdate(args);
		
		// MAW_NUM_ARGのレコードに 対して発番する（レコードの new_no を設定する）
		execProcRetNumStr(num_biz_typ);
		
		// MAW_NUM_ARGから発番した値を取得する
		MCList<MAW_NUM_ARG_R> l = MCList.create(MAW_NUM_ARG_R.class);
		sql(sqlid_wk_s)
			.mainQuery()
			.select(
				S0.peg_no,
				S0.new_no
			)
			.from(S0)
			.orderBy(S0.peg_no.asc()).executeQuery(l);
		return l;
	}

	/**
	 * 一括発番処理を実行します（static method）<p>
	 * num_ptn_cdは必須です。<br>
	 * peg_noには一意の値を設定してください。<br>
	 * 発番したＮＯは引数のargsのnew_noに設定されます。
	 * @param num_biz_typ 発番業務区分
	 * @param args 発番処理に必要な要素引数のリスト
	 */
	public static void setNum(MAC_NUM_BIZ_TYP num_biz_typ, MCList<ElmArgsR> args) {
		object(CLAZZ)._setNum(num_biz_typ, args);
	}

	/**
	 * {@link #setNum(MAC_NUM_BIZ_TYP, MCList)}
	 */
	protected void _setNum(MAC_NUM_BIZ_TYP num_biz_typ, MCList<ElmArgsR> args) {
		
		MCList<MAW_NUM_ARG_R> l = _getNum(num_biz_typ, args);
		
		// 引数argsに発番した値を設定する
		MCIndexKey idxkey = l.createIndex(MAW_NUM_ARG_R.$peg_no);
		
		for (ElmArgsR r : args) {
			MAW_NUM_ARG_R tmp = l.getFirst(idxkey, r.peg_no());
			if (!isNull(tmp)) {
				r.new_no(tmp.new_no());
			}
		}
	}
	
	/**
	 * MAW_NUM_ARGのレコードに new_no を設定する
	 * @param num_biz_typ 発番業務区分
	 */
	protected void execProcRetNumStr(MAC_NUM_BIZ_TYP num_biz_typ) {
		ArgsR r = ArgsR.create();
		r.num_biz_typ(num_biz_typ.value());
		String procid = "MAPA_NUM$P_SET_BY_PTN";
		execProc(createSqlId(LOGIC_ID, procid, "execProcRetNumStr"),
				procid, r, ":num_biz_typ");
	}
	
	/**
	 * データ不整合などが原因ではなく、ユーザの入力値の入力漏れで発生する場合があるメッセージＩＤや</br>
	 * マスタメンテナンス画面のチェック処理では担保できないメッセージＩＤのリストを返します。</br>
	 * 呼び出し元で例外をthrowしないようにする実装をしたい場合に使用する想定です。
	 * @return
	 */
	public static List<String> getNrmlNumErrMsgIdList() {
		return object(CLAZZ)._getNrmlNumErrMsgIdList();
	}

	protected List<String> _getNrmlNumErrMsgIdList() {
		List<String> ret = new ArrayList<String>();
		ret.add(MAUCD0032); // ユーザの入力値の入力漏れで発生する場合がある
		ret.add(MAUCD0033); // マスタメンテナンス画面のチェック処理では担保できない
		return ret;
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 発番処理を実行します<br>
	 */
	public class Upd01 extends MAUCL_Num_MC_A.Upd01 {
		@Override
		protected void call() {
			ArgsR r = up0().clone();
			down0().num(_getNum(MAC_NUM_BIZ_TYP.get(r.num_biz_typ()), r.elm_args()));
		}
	}

	// 発番(START) ====================================
	/**
	 * オラクルシーケンスから番号を取得します。<br>
	 * <P>
	 * {@link #doSeqCache}を使用して作成したキャッシュがある場合はキャッシュから
	 * 番号を取得します。<br>
	 * キャッシュをしていない場合 及び キャッシュが０件の場合はオラクルシーケンスから番号を取得します。
	 * </P>
	 *
	 * @param seq_nm オラクルシーケンスの名称
	 * @return オラクルシーケンスから取得した値
	 */
	public static MCNumber getSequence(String seq_nm) {
		Map<String, List<MCNumber>> m = getSeqCacheObject().map();
		List<MCNumber> list = m.get(seq_nm);
		if (list == null || list.size() == 0) {
			String seqnmcol = "seqnm";
			MCRow bind = MCRow.create();
			bind.addStringColumn(seqnmcol, seq_nm);
			return execFuncNumber(
					createSqlId(LOGIC_ID, "MAPA_NUM$F_GET_SEQ", "getSequence"),
					MAPA_NUM$F_GET_SEQ(bind(seqnmcol)),
					bind);
		}
		MCNumber ret = list.get(0);
		list.remove(0);
		return ret;
	}

	/**
	 * シーケンス発番のキャッシュを保持するクラス
	 * @return
	 */
	protected static final Class<SeqCache> SeqCacheClass = SeqCache.class;

	/**
	 * シーケンス発番のキャッシュを保持するオブジェクト
	 * @return
	 */
	protected static SeqCache getSeqCacheObject() {
		return object(SeqCacheClass);
	}

	/**
	 * オラクルシーケンスから番号を取得し、キャッシュします。
	 * <p>
	 * すでにキャッシュが存在する場合は、存在するキャッシュが、
	 * 引数で指定されたキャッシュする件数未満の場合は、キャッシュ件数が
	 * 引数で指定された件数になるように番号を取得します。
	 * 存在するキャッシュが引数で指定されたキャッシュする件数以上の場合は
	 * 何もしません。
	 * </p>
	 * <p>
	 * キャッシュは、このスレッドのリクエストオブジェクトに保存されます。
	 * </p>
	 * @param typ  発番システム区分
	 * @param size キャッシュする件数
	 */
	public static void doSeqCache(IfNumSysTyp typ, int size) {
		doSeqCache(typ.value(), size);
	}

	/**
	 * オラクルシーケンスから番号を取得し、キャッシュします。
	 * <p>
	 * すでにキャッシュが存在する場合は、存在するキャッシュが、
	 * 引数で指定されたキャッシュする件数未満の場合は、キャッシュ件数が
	 * 引数で指定された件数になるように番号を取得します。
	 * 存在するキャッシュが引数で指定されたキャッシュする件数以上の場合は
	 * 何もしません。
	 * </p>
	 * <p>
	 * キャッシュは、このスレッドのリクエストオブジェクトに保存されます。
	 * </p>
	 * @param seq_nm シーケンス名
	 * @param size キャッシュする件数
	 */
	public static void doSeqCache(String seq_nm, int size) {
		Map<String, List<MCNumber>> m = getSeqCacheObject().map();
		List<MCNumber> list = m.get(seq_nm);
		if (list == null) {
			list = new ArrayList<MCNumber>();
			m.put(seq_nm, list);
		}

		int n = size - list.size();
		if (n > 0) {
			MCNumber[] nums = getSeqArray(seq_nm, n);
			for (MCNumber num : nums) {
				list.add(num);
			}
		}
	}

	/**
	 * オラクルシーケンスの番号キャッシュを破棄します。
	 *
	 * @param typ  発番システム区分
	 */
	public static void clearSeqCache(IfNumSysTyp typ) {
		clearSeqCache(typ.value());
	}

	/**
	 * オラクルシーケンスの番号キャッシュを破棄します。
	 *
	 * @param seq_nm シーケンス名
	 */
	protected static void clearSeqCache(String seq_nm) {
		Map<String, List<MCNumber>> m = getSeqCacheObject().map();
		List<MCNumber> list = m.get(seq_nm);
		if (list != null) {
			list.clear();
		}
	}

	/**
	 * 発番する.<br>
	 * （発番パターンコードを使用しない）
	 * 0埋めされた文字列を返す。
	 * <P>
	 * {@link #doSeqCache}を使用して作成したキャッシュがある場合はキャッシュから
	 * 番号を取得します。<br>
	 * キャッシュをしていない場合 及び キャッシュが０件の場合はオラクルシーケンスから番号を取得します。
	 * </P>
	 * 
	 * @param typ 発番システム区分
	 * @return ＮＯ文字列
	 */
	public static String getStrSeq(IfNumSysTyp typ) {
		MCNumber num = getSequence(typ.value());
		String no = num.toString();
		if (!isNull(typ.length())) {
			no = lpad(no, typ.length().intValue(), "0");
		}
		if (!isNull(typ.prefix())) {
			if (!isNull(typ.length())
					&& no.length() + typ.prefix().length() > typ.length().intValue()) {
				no = typ.prefix() + no.substring(typ.prefix().length());
			}
			else {
				no = typ.prefix() + no;
			}
		}
		return no;
	}

	/**
	 * オラクルシーケンスから複数の番号を取得します。<br>
	 *
	 * @param seq_nm オラクルシーケンスの名称
	 * @param size 発番する番号の数
	 * @return オラクルシーケンスから取得した値の配列
	 */
	protected static MCNumber[] getSeqArray(String seq_nm, int size) {
		MCRow bind = MCRow.create();
		bind.setStringNE("seqNm", seq_nm);
		bind.setNumberNE("cnt", size);
		
		MCList<MCRow> rslt = MCList.create(MCRow.class);
		String seqcol = "seq";
		rslt.addNumberColumn(seqcol);
		dbTran().statement().executeQuery("MACUL0060_MAPA_NUM_S01",
				Query.get().MACUL0060_MAPA_NUM_S01(), bind, null, null, rslt);

		MCNumber[] arr = new MCNumber[rslt.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rslt.getNumber(i, seqcol);
		}
		return arr;
	}

	//FMCB CUSTOM END
}