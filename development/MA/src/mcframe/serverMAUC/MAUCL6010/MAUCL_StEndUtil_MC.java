package mcframe.serverMAUC.MAUCL6010;

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
import static mcframe.serverCore.requester.MCRequestObject.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static mcframe.serverCore.queryapi.MCQueryApiBuilder.*;
import mcframe.serverMAUD.MAUDL5010.MAUDL_RLUtil;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.container.MCRow.Status;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_StEndUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_StEndUtil_MC extends MAUCL_StEndUtil_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MAUCL_StEndUtil> CLAZZ = MAUCL_StEndUtil.class;
	
	/**
	 * 開始日終了日制御対象のマスタ画面かどうかを返します。
	 * 
	 * @param cond ＤＢコンテナ
	 * @return 開始日終了日制御対象のマスタ画面の場合true
	 */
	public static boolean isStEndDt(MCDBContainer cond) {
		return object(CLAZZ)._isStEndDt(cond);
	}
	
	/**
	 * ベースキーの配列を取得します。ベースキーは開始日以外のKey項目の配列です。
	 * 
	 * @param cond ＤＢコンテナ
	 * @return ベースキーの配列
	 */
	public static String[] getBaseKey(MCDBContainer cond) {
		return object(CLAZZ)._getBaseKey(cond);
	}
	
	/**
	 * 開始日終了日のオーバラップをチェックします。
	 * 
	 * @param cond ＤＢコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	public static <R extends MCRow> void checkStEndDtValid(MCDBContainer cond, String[] base_keys, MCMessageList ml) {
		object(CLAZZ)._checkStEndDtValid(cond, base_keys, ml);
	}
	
	/**
	 * 開始日終了日の連続性をチェックします。<p>
	 * 開始日終了日はオーバラップしていないことを前提としています。
	 * @param chkList 連続性をチェックするDBコンテナ
	 * @param trg_st_dt チェック適用開始日
	 * @param trg_end_dt チェック適用停止日
	 */
	public static<R extends MCDBContainer, L extends MCList<R>>boolean checkStEndDtContinuity(
			L chkList, MCDate trg_st_dt, MCDate trg_end_dt) {
		return object(CLAZZ)._checkStEndDtContinuity(chkList, trg_st_dt, trg_end_dt);
	}
	
	/**
	 * 開始日の項目名
	 * 
	 */
	protected static final String $ST_DT_CLM = "st_dt";
	
	/**
	 * 終了日の項目名
	 * 
	 */
	protected static final String $END_DT_CLM = "end_dt";
	
	/**
	 * 開始日の項目名
	 * 
	 */
	protected static final String $ST_DT_CLM_PATH_SUFIX = ".st_dt";
	
	/**
	 * 終了日の項目名
	 * 
	 */
	protected static final String $END_DT_CLM_PATH_SUFIX = ".end_dt";

	/**
	 * 開始日[変更前]の項目名
	 * 
	 */
	protected static final String $ST_DT_KEY_CLM = "st_dt_key";

	/**
	 * 更新カウンタの項目名
	 * 
	 */
	protected static final String $UPD_CNTR_CLM = "upd_cntr";

	/**
	 * 開始日終了日制御対象のマスタ画面かどうかを返します。
	 * 
	 * @param cond ＤＢコンテナ
	 * @return 開始日終了日制御対象のマスタ画面の場合true
	 */
	protected boolean _isStEndDt(MCDBContainer cond) {
		String[] arr = cond.getColumnPathArray();
		boolean boo = false;
		for (String s :arr) {
			if (isSame(s, $ST_DT_CLM) || s.endsWith($ST_DT_CLM_PATH_SUFIX)) {
				boo = true;
				break;
			}
		}
		if (!boo) {
			return false;
		}
		
		for (String s :arr) {
			if (isSame(s, $END_DT_CLM) || s.endsWith($END_DT_CLM_PATH_SUFIX)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * ベースキーの配列を取得します。ベースキーは開始日以外のKey項目の配列です。
	 * 
	 * @param cond ＤＢコンテナ
	 * @return ベースキーの配列
	 */
	protected String[] _getBaseKey(MCDBContainer cond) {
		String[] clms = cond.getKeyColumn();
		List<String> ret = new ArrayList<String>();
		for (String clm :clms) {
			if (!(isSame(clm, $ST_DT_CLM) || clm.endsWith($ST_DT_CLM_PATH_SUFIX))) {
				ret.add(clm);
			}
		}
		return ret.toArray(new String[0]);
	}

	/**
	 * 開始日終了日のオーバラップをチェックします。
	 * 
	 * @param cond ＤＢコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	protected <R extends MCRow> void _checkStEndDtValid(MCDBContainer cond, String[] base_keys, MCMessageList ml) {
		// 全体で重複チェックをする場合
		if (base_keys.length == 0) {
			_checkStEndDtValidByAll(cond, ml);
		}
		// ベースキーごとに重複チェックをする場合
		else {
			_checkStEndDtValidByBaseKey(cond, base_keys, ml);
		}
	}

	/**
	 * 開始日終了日のオーバラップをベースキーごとにチェックします。
	 * 
	 * @param cond ＤＢコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	protected <R extends MCRow> void _checkStEndDtValidByBaseKey(MCDBContainer cond, String[] base_keys, MCMessageList ml) {
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(cond);

		MCPermColumn[] base_keycols = Arrays.stream(base_keys)
				.map(k -> cond.getColumn$(k))
				.toArray(MCPermColumn[]::new);
		String sqlid = createSqlId(LOGIC_ID, cond, "S03");
		MCMainQuery query = builder.setSelectForUpdate(cond.getKeyColumn$())
				.setSelect(cond.getKeyColumn$())
				// 開始日違いのレコードを抽出
				.addWhereNullable(base_keycols)
				// 期間重複条件
				.addWhereWithAnd(makeNeq(cond.getColumn$($ST_DT_CLM), bind($ST_DT_CLM)))
				.addWhereWithAnd(makeGte(cond.getColumn$($END_DT_CLM), bind($ST_DT_CLM)))
				.addWhereWithAnd(makeLte(cond.getColumn$($ST_DT_CLM), bind($END_DT_CLM)))
				.buildSelect(sqlid);

		int cnt;
		try {
			cnt = query.executeQuery(cond, cond);
		}
		catch (MCException e) {
			if (!e.getID().equals(Core_Msg.FCBCC0039)) {
				throw e;
			}
			// 2件以上検出された場合は、2とする
			cnt = 2;
		}
		if (cnt > 0) {
			ml.add(new MCMessage(cond, null, MAUDL0324));
		}
	}

	/**
	 * 開始日終了日のオーバラップを全体でチェックします。
	 * 
	 * @param cond ＤＢコンテナ
	 * @param ml メッセージリスト
	 */
	protected <R extends MCRow> void _checkStEndDtValidByAll(MCDBContainer cond, MCMessageList ml) {
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(cond);

		builder.setSelect(cond.getBaseColumns$());
		// 主キー違いのレコードを抽出
		MCPredicate predicate = null;
		for (String key : cond.getKeyColumn()) {
			MCPredicate predInParen = makeNeq(cond.getColumn$(key), bind(key));
			if (cond.isNullableColumn(key)) {
				predicate = predicate
						.and(makeIsNotNull(cond.getColumn$(key))
								.or(bind(key).isNotNull()));
			}
			predicate = (predicate == null) ?
					predInParen : predicate.or(predInParen);
		}
		builder.setWhere(predicate);

		String sqlid = createSqlId(LOGIC_ID, cond, "S02");
		MCMainQuery query = builder
				.addWhereWithAnd(makeGte(cond.getColumn$($END_DT_CLM), bind($ST_DT_CLM)))
				.addWhereWithAnd(makeLte(cond.getColumn$($ST_DT_CLM), bind($END_DT_CLM)))
				.buildSelect(sqlid);

		int cnt;
		try {
			cnt = query.executeQuery(cond, cond);
		} catch (MCException e) {
			if (!e.getID().equals(Core_Msg.FCBCC0039)) {
				throw e;
			}
			// 2件以上検出された場合は、2とする
			cnt = 2;
		}
		if (cnt > 0) {
			ml.add(new MCMessage(cond, null, MAUDL0324));
		}
	}

	/**
	 * 指定期間内で使用開始日停止日の連続性をチェックします。
	 * 開始日終了日はオーバラップしていないことを前提としています。
	 * @param dbc 連続性をチェックするDBコンテナ
	 * @param trg_st_dt チェック適用開始日
	 * @param trg_end_dt チェック適用停止日
	 * @return
	 */
	protected<R extends MCDBContainer, L extends MCList<R>> boolean _checkStEndDtContinuity(
			L chkList, MCDate trg_st_dt, MCDate trg_end_dt) {
		
		if(isNullOr(trg_st_dt, trg_end_dt) 
				|| chkList.isEmpty()){
			return false;
		}
		
		if(isStEndDt(chkList.createRow())){
			chkList.sort(SortType.ASC, $ST_DT_CLM);
			MCDate old_end_dt;
			MCDate next_st_dt;
			// チェック適用開始日の確認
			old_end_dt = trg_st_dt.addDay(-1);
			
			for(R r: chkList){
				next_st_dt = r.getDateNE($ST_DT_CLM);
				if(!isContinue(old_end_dt, next_st_dt)){
					return false;
				}
				old_end_dt = r.getDateNE($END_DT_CLM);
			}
			
			// チェック適用停止日の確認
			if(!isContinue(old_end_dt, trg_end_dt.addDay(1))){
				return false;
			}
		}
		return true;
	}

	/**
	 * 日付の連続性をチェックします。<p>
	 * old + 1日 >= next なら連続していると見なします。
	 * @param old
	 * @param next
	 * @return
	 */
	protected boolean isContinue(MCDate old, MCDate next){
		return old.addDay(1).gteDate(next);
	}
	
	//　以降、分割用ユーティリティ
	/**
	 * 補正ロジック用項目：Rowステータスのソート順を表すカラム
	 */
	public static final String ROW_STATUS_NO_COL_NAME = "_row_status_no_column_name";

	/**
	 * 登録対象と適用開始日を含まないキー項目（以降、ベースキー）が一致するDBレコードを取得し、登録可能な状態にしたリストを返します。<p>
	 * 
	 * 補正の方法は以下の通りです。<br>
	 * ・ベースキーごとに補正する<br>
	 * ・DB上のデータ、上りデータ、適用開始日の昇順に重複している期間を削っていく<br>
	 * つまり、ソートされたもののうち、indexの大きいものが優先して現状が維持されます。
	 * <p>
	 * DBレコードには変更前キーが格納され、値にはキーが設定されます。<br>
	 * ただし、DBレコードが分割された場合、開始日の高いほうのRowコンテナの変更前キー項目はクリアされます。
	 * <p>
	 * データに重複があった場合、メッセージリストにメッセージを格納します。
	 * 設定されるメッセージは以下のいずれかです。<br>
	 * MAUDL0379：登録済みのデータ内で重複があった場合<br>
	 * MAUDL0381：登録対象と登録済みのデータに重複があった場合<br>
	 * MAUDL0382：登録対象と登録済みのデータに重複（同一期間）があった場合<br>
	 * MAUDL0380：登録対象内に重複があった場合<br>
	 * 
	 * 各メッセージが設定されたときに補正を行わせたくない場合、引数stopMsgIdに上記のメッセージIDを渡してください。
	 * <p>
	 * 登録対象がすでに更新されていた場合は例外をthrowします。
	 * 
	 * @param updList 登録対象コンテナ(ステータスNONEは存在しないこと)
	 * @param builder 検索処理と同等のselect句、join句が付加されたクエリAPIビルダー
	 * @param srchList builderによる検索結果を格納するリスト
	 * @param rowToMsg コンテナとメッセージが格納されるマップ
	 * @param stopMsgId 補正を停止するメッセージID
	 * @return リスト isNull(updList) == true の場合はnull
	 */
	public static MCList<MCDBContainer> correctRange(
			MCList<MCDBContainer> updList, 
			MCQueryApiBuilder builder,
			MCList<MCDBContainer> srchList,
			IdentityHashMap<MCRow, MCMessageList> rowToMsg,
			String[] stopMsgId){
		return object(CLAZZ)._correctRange(updList, builder, srchList, rowToMsg, stopMsgId);
	}

	/**
	 * {@link #correctSelectedDbListWithUp(MCList<MCDBContainer>, MCMessageList)}の実装です。<p>
	 */
	protected MCList<MCDBContainer> _correctRange(
			MCList<MCDBContainer> updList,
			MCQueryApiBuilder builder,
			MCList<MCDBContainer> srchList,
			IdentityHashMap<MCRow, MCMessageList> rowToMsg,
			String[] stopMsgId){
		
		if (isNull(updList)){
			return null;
		}
		
		MCList<MCDBContainer> rtn = updList.createInstance();
		
		//--補正：ベースキのグループリストごとに分割、連結を行う
		
		//補正に必要なカラムの配列
		String[] keyCols = updList.get(0).getKeyColumn();
		String[] basekeyCols = getBaseKey(updList.get(0));
		String[] msgBindCols = MCCollectionUtil.concat(keyCols, new String[]{$END_DT_CLM});
		
		// basekeyによるWHERE句を追加
		MCDBContainer baseDbc = builder.getBaseDbc();
		MCPermColumn[] baseKeyCols = Arrays.stream(basekeyCols)
				.map(k -> baseDbc.getColumn$(k)).toArray(MCPermColumn[]::new);
		builder.addWhereNullable(baseKeyCols);

		MCList<MCDBContainer>[] supds = updList.groupList(basekeyCols);
		for (MCList<MCDBContainer> supd : supds) {
			
			//補正対象を作成する
			MCList<MCDBContainer> toCrtMod = supd.subList(Status.CREATE, Status.MODIFY);
			MCList<MCDBContainer> toDelMod = supd.subList(Status.DELETE, Status.MODIFY);
			
			dbSelectUnaffectedInBaseKey(builder, 
					srchList,
					toDelMod, 
					supd,
					basekeyCols, 
					keyCols);

			setStatusNo(srchList);
			setStatusNo(toCrtMod);
			
			//補正を行う
			//成功した場合は、補正したデータのみを返す。
			//停止した場合は、重複データを返す。
			if (cut(srchList, toCrtMod, msgBindCols,  rowToMsg, stopMsgId)) {
				rtn.addAll(srchList.statusChangedList());
			}
			else {
				rtn.addAll(srchList);
			}
			rtn.addAll(toDelMod.subList(Status.DELETE));
			rtn.addAll(toCrtMod);
			
		}
		return rtn;
	}

	/**
	 * 更新対象のカラムであり、開始、終了日カラムではないものの配列を返します。
	 * @param tar DBコンテナ
	 * @return カラム配列
	 */
	protected String[] getUpdColsExptStEd(MCDBContainer tar) {
		String[] skipsArr = tar.getUpdSkipColumn();
		Set<String> skips = new HashSet<>(Arrays.asList(skipsArr));
		String[] tblcols = Stream.of(tar.getConstColumnPathArray())
				.filter(c -> !MAUDL_RLUtil.isLinkedToMainTableColumn(tar, c)
						&& !skips.contains(c)
						&& !$ST_DT_CLM.equals(c)
						&& !$END_DT_CLM.equals(c))
				.toArray(String[]::new);
		return tblcols;
	}
	
	protected void setStatusNo(MCList<? extends MCRow> l) {
		l.addNumberColumn(ROW_STATUS_NO_COL_NAME);
		for(MCRow r : l) {
			setStatusNo(r);
		}
	}
	
	protected void setStatusNo(MCRow r) {
		if (r.isStatusNone()) {
			r.addNumberColumn(ROW_STATUS_NO_COL_NAME, getStatusNoDB());
		}
		else if (r.isStatusModify()) {
			r.addNumberColumn(ROW_STATUS_NO_COL_NAME, getStatusNoModify());
		}
		else if (r.isStatusCreate()) {
			r.addNumberColumn(ROW_STATUS_NO_COL_NAME, getStatusNoCreate());
		}
		else {
			r.addNumberColumn(ROW_STATUS_NO_COL_NAME, getStatusNoDelete());
		}
	}
	
	protected MCNumber getStatusNoDB() {
		return MCNumber.ZERO;
	}
	protected MCNumber getStatusNoModify() {
		return MCNumber.ONE;
	}
	protected MCNumber getStatusNoCreate() {
		return MCNumber.ONE;
	}
	protected MCNumber getStatusNoDelete() {
		return MCNumber.ONE;
	}

	/**
	 * トリム、分割、削除をします。<p>
	 * 
	 * 引数target及びtarget2の期間重複部分を削っていきます。<p>
	 * 補正する順番は以下の通りです。<br>
	 * 【修正順番】
	 * target内の重複補正<br>
	 * targetのtarget2との重複補正<br>
	 * target2内の重複補正<p>
	 * 
	 * 重複があった場合、msgListにメッセージが格納されます。<br>
	 * 
	 * 設定されるメッセージは以下のいずれかです。<br>
	 * MAUDL0379：登録済みのデータ内で重複があった場合<br>
	 * MAUDL0381：登録対象と登録済みのデータに重複があった場合<br>
	 * MAUDL0382：登録対象と登録済みのデータに重複（同一期間）があった場合<br>
	 * MAUDL0380：登録対象内に重複があった場合<p>
	 * 
	 * メッセージが設定されたときに処理を行わせたくない場合、引数stopMsgIdに上記のメッセージIDを渡してください。<br>
	 * 上記設定により、処理が行われなかったものが存在した場合、targetは処理が行われなかったデータのみを保持した状態になります。<br>
	 * 処理が中断される区切りの単位は、上記の【修正順番】ごとです。
	 * 
	 * @return 分割を停止した場合true
	 */
	protected boolean cut(MCList<MCDBContainer> target, MCList<MCDBContainer> target2, String[] msgBindCols,
			IdentityHashMap<MCRow, MCMessageList> rowToMsg, String[] stopMsgId) {
		boolean rtn = false;
		
		rtn = cutMain(target, target, msgBindCols, rowToMsg, stopMsgId);
		if (!rtn){
			return false;
		}
		rtn = cutMain(target, target2, msgBindCols, rowToMsg, stopMsgId);
		if (!rtn){
			return false;
		}
		rtn = cutMain(target2, target2, msgBindCols, rowToMsg, stopMsgId);
		if (!rtn){
			return false;
		}
		return rtn;
	}


	/**
	 * トリム、分割、削除をします。<p>
	 * 
	 * 引数targetのデータのうち、causeのデータと期間重複する部分を削っていきます。<br>
	 * 時系列順にcauseのデータが使用され、targetのデータが補正されます。<br>
	 * 重複があった場合、msgListにメッセージが格納されます。<br>
	 * 
	 * 設定されるメッセージは以下のいずれかです。<br>
	 * MAUDL0379：登録済みのデータ内で重複があった場合<br>
	 * MAUDL0381：登録対象と登録済みのデータに重複があった場合<br>
	 * MAUDL0382：登録対象と登録済みのデータに重複（同一期間）があった場合<br>
	 * MAUDL0380：登録対象内に重複があった場合<br>
	 * 
	 * メッセージが設定されたときに処理を行わせたくない場合、引数stopMsgIdに上記のメッセージIDを渡してください。<br>
	 * 上記設定により、処理が行われなかったものが存在した場合、targetは処理が行われなかったデータのみを保持した状態になります。
	 * 
	 * @return 分割を停止した場合true
	 */
	protected boolean cutMain (MCList<MCDBContainer> target, MCList<MCDBContainer> cause, String[] msgBindCols,
			IdentityHashMap<MCRow, MCMessageList> rowToMsg, String[] stopMsgId) {
		boolean endConv = false;
		sortForSplit(cause);
		
		//重複処理を止められたコンテナのリストとして使用
		IdentityHashMap<MCDBContainer, Boolean> dupList = new IdentityHashMap<MCDBContainer, Boolean>();
		Boolean dummyVal = null;
		boolean delFlg = false;
		MCList<MCDBContainer> noDown = target.createInstance();

		//分割
		while(!endConv){
			endConv = true;
			MCList<MCDBContainer> created = target.createInstance();
			for(int mi = 0 ; mi < target.size() ; mi++) {
				MCDBContainer r1 = target.get(mi);
				if (r1.isStatusDelete()){
					continue;
				}
				
				MCDate stdt = r1.getDate($ST_DT_CLM);
				MCDate eddt = r1.getDate($END_DT_CLM);
				
				for(int mi2 = 0; mi2 < cause.size() ; mi2++) {
					MCDBContainer r2 = cause.get(mi2);
					if (r1 == r2) {
						continue;
					}
					MCDate stdt2 = r2.getDate($ST_DT_CLM);
					MCDate eddt2 = r2.getDate($END_DT_CLM);

					if (stdt.gtDate(eddt2)) {
						continue;
					}
					else
					if (eddt.ltDate(stdt2)) {
						break;
					}
					
					//前を削る
					if (stdt2.lteDate(stdt) && (eddt2.gteDate(stdt) && eddt2.ltDate(eddt))) {
						if (delFlg) {
							break;
						}
						MCDBContainer nr = copy(r1);

						MCMessage m = stockMessageForCut(r1, r2, msgBindCols, rowToMsg);
						if (!isStop(m, stopMsgId)){
							removeBefore(r1, r2,  target, rowToMsg);
							createAfter(nr, created, eddt2);
						}
						else {
							dupList.put(r1, dummyVal);
							dupList.put(r2, dummyVal);
						}
						break;
					}
					//後を削る
					else if(eddt2.gteDate(eddt) && (stdt2.gtDate(stdt) && stdt2.lte(eddt))) {
						if (delFlg) {
							break;
						}
						MCMessage m = stockMessageForCut(r1, r2, msgBindCols, rowToMsg);

						if (!isStop(m, stopMsgId)){
							eddt = modifyBefore(r1, target, stdt2);
						}
						else {
							dupList.put(r1, dummyVal);
							dupList.put(r2, dummyVal);
						}
						break;
					}
					//分割する
					else if (stdt2.gtDate(stdt) && eddt2.ltDate(eddt)) {
						if (delFlg) {
							break;
						}
						MCDBContainer nr = copy(r1);
						clearBeforeKeyColumns(nr);
						//更新関係の項目は消さない
						
						MCMessage m = stockMessageForCut(r1, r2, msgBindCols, rowToMsg);

						if (!isStop(m, stopMsgId)){
							modifyBefore(r1, target, stdt2);
							createAfter(nr, created, eddt2);
							clearBeforeKey(nr);
						}
						else {
							dupList.put(r1, dummyVal);
							dupList.put(r2, dummyVal);
						}
						break;
					}
					// 新規・更新行の期間が既存行の期間全てに被った場合
					// 既存行を新規・更新行の内容で上書き（削除はしない。画面では削除処理は別操作のため）
					else if(stdt2.lteDate(stdt) && eddt2.gteDate(eddt)) {
						MCDBContainer nr = copy(r2);

						MCMessage m = stockMessageForCut(r1, r2, msgBindCols, rowToMsg);

						if (!isStop(m, stopMsgId)){
							delFlg = true;
							// 新規・更新行の開始日＜既存行の開始日
							// 新規・更新行の終了日を更新
							if (!stdt2.eqDate(stdt)) {
								modifyBefore(r2, target, stdt);
							}

							// 既存行の終了日＜新規・更新行の終了日
							// 新規・更新行をコピーして新規行を作成
							if (eddt2.gtDate(eddt)) {
								createDelAfter(nr, created, eddt, eddt2);
							}

							// 既存行を新規・更新行の値で上書き（ＤＢ項目＋名称）
							copyUpdColsExptStEd(r1,r2);
							copyAllColsExptStEd(r1,r2);
						}
						else {
							dupList.put(r1, dummyVal);
							dupList.put(r2, dummyVal);
						}
						break;
					}
				}
				// 新規追加がある場合は、再ソート後補正し直し
				if (created.size() > 0) {

					// 新規追加行と同一キーの既存行があれば、新規追加行を後で削除するために「noDown」に追加する
					// 「後で」削除する理由は既存行に対する補正を行うため
					MCIndexKey stdtIdxKey = target.createIndex($ST_DT_CLM);
					for(MCDBContainer r : created) {
						if (!isNull(target.getFirst(stdtIdxKey, r.getDate($ST_DT_CLM)))) {
							noDown.add(r);
						}
					}

					target.addAll(created);
					if(delFlg) {
						cause = created;
					}
					sortForSplit(target);
					endConv = false;
					break;
				}
			}
		}

		// 一時的に追加した新規追加行を削除
		target.removeAll(noDown);

		if (dupList.size() <= 0) {
			return true;
		}
		else {
			target.setAll(dupList.keySet());
			return false;
		}
	}
	
	protected MCDBContainer copy(MCDBContainer org) {
		MCDBContainer nr = org.clone();
		nr.setParamIndex(-1);
		nr.setParamRowIndex(-1);
		return nr;
	}
	
	
	protected boolean isStop(MCMessage m, String[] stopMsgId) {
		boolean stop = false;
		if (m != null) {
			stop = MCCollectionUtil.contains(m.getID(), stopMsgId);
		}
		return stop;
	}

	protected void sortForSplit(MCList<MCDBContainer> mixed) {
		mixed.sort(SortType.ASC,ROW_STATUS_NO_COL_NAME, $ST_DT_CLM);
	}

	/**
	 * 期間が重複していた時のメッセージを設定します。<p>
	 * バインドには引数bindColsのカラムの値を設定します。<br>
	 * 設定されるメッセージは以下のいずれかです。<br>
	 * MAUDL0379：登録済みのデータ内で重複があった場合<br>
	 * MAUDL0381：登録対象と登録済みのデータに重複があった場合<br>
	 * MAUDL0382：登録対象と登録済みのデータに重複（同一期間）があった場合<br>
	 * MAUDL0380：登録対象内に重複があった場合<br>
	 */
	protected MCMessage stockMessageForCut(
			MCDBContainer r1,
			MCDBContainer r2,
			String[] bindCols,
			IdentityHashMap<MCRow, MCMessageList> rowToMsg){
		MCMessage rtn = null;
		boolean isOneDb = isDbRow(r1);
		boolean isTwoDb = isDbRow(r2);
		
		MCDBContainer bindr = null;
		
		if (isOneDb && isTwoDb) {
			bindr = r1;
			setMsgDbDupli(bindr, bindCols, rowToMsg);
			bindr = r2;
			rtn = setMsgDbDupli(bindr, bindCols, rowToMsg);
		}
		else if (isOneDb && !isTwoDb) {
			if(r1.getDate($ST_DT_CLM).eqDate(r2.getDate($ST_DT_CLM)) && r1.getDate($END_DT_CLM).eqDate(r2.getDate($END_DT_CLM))) {
				bindr = r1;
				setMsgDbAndUpDupli_SamePeriod(bindr, bindCols, rowToMsg);
				bindr = r2;
				rtn = setMsgDbAndUpDupli_SamePeriod(bindr, bindCols, rowToMsg);
			}
			else {
				bindr = r1;
				setMsgDbAndUpDupli(bindr, bindCols, rowToMsg);
				bindr = r2;
				rtn = setMsgDbAndUpDupli(bindr, bindCols, rowToMsg);
			}
		}
		else if (!isOneDb && !isTwoDb) {
			bindr = r1;
			setMsgUpDupli(bindr, bindCols, rowToMsg);
			bindr = r2;
			rtn = setMsgUpDupli(bindr, bindCols, rowToMsg);
		}
		return rtn;
	}

	protected MCMessage setMsgDbDupli(
			MCDBContainer bindr,
			String[] bindCols,
			IdentityHashMap<MCRow, MCMessageList> rowToMsg) {
		MCMessage rtn = new MCMessage(
				bindr, null,
				MAUDL0379,
				(Object[])bindr.toArray(bindCols)
				);
		setRowToMsg(bindr, rtn, rowToMsg);
		return rtn;
	}

	protected MCMessage setMsgDbAndUpDupli(
			MCDBContainer bindr,
			String[] bindCols,
			IdentityHashMap<MCRow, MCMessageList> rowToMsg) {
		MCMessage rtn = new MCMessage(
				bindr, null,
				MAUDL0381,
				(Object[])bindr.toArray(bindCols)
				);
		setRowToMsg(bindr, rtn, rowToMsg);
		return rtn;
	}

	protected MCMessage setMsgDbAndUpDupli_SamePeriod(
			MCDBContainer bindr,
			String[] bindCols,
			IdentityHashMap<MCRow, MCMessageList> rowToMsg) {
		MCMessage rtn = new MCMessage(
				bindr, null,
				MAUDL0382,
				(Object[])bindr.toArray(bindCols)
				);
		setRowToMsg(bindr, rtn, rowToMsg);
		return rtn;
	}

	protected MCMessage setMsgUpDupli(
			MCDBContainer bindr,
			String[] bindCols,
			IdentityHashMap<MCRow, MCMessageList> rowToMsg) {
		MCMessage rtn = new MCMessage(
				bindr, null,
				MAUDL0380,
				(Object[])bindr.toArray(bindCols)
				);
		setRowToMsg(bindr, rtn, rowToMsg);
		return rtn;
	}

	protected void setRowToMsg(MCDBContainer bindr, MCMessage rtn, IdentityHashMap<MCRow, MCMessageList> rowToMsg){
		MCMessageList l = rowToMsg.get(bindr);
		if (l == null) {
			l = new MCMessageList();
			rowToMsg.put(bindr, l);
		}
		l.add(rtn);
	}

	/**
	 * 削除対がCREATEステータスの場合、listから削除します。
	 * それ以外の場合、DELETEステータスにします。
	 * @param rmv 削除対象
	 * @param cause 原因 
	 * @param mixed list
	 * @param rowToMsg メッセージ
	 * @return listから削除されなかった場合false
	 */
	protected boolean removeBefore(
			MCDBContainer rmv, 
			MCDBContainer cause, 
			MCList<MCDBContainer> mixed, 
			IdentityHashMap<MCRow, MCMessageList> rowToMsg){
		
		if (rmv.isStatusCreate()) {
			mixed.remove(rmv);
			rowToMsg.remove(rmv);
			return true;
		}
		else {
			rmv.setStatus(Status.DELETE);
			return false;
		}
	}

	protected MCDate modifyBefore(MCDBContainer r, 
			MCList<MCDBContainer> mixed, 
			MCDate stdt2){
		MCDate eddtBf = stdt2.addDay(-1);
		// 終了日付の時分秒が23:59:59 を設定
		MCDate eddt = MCDate.valueOf(eddtBf.getYear(), eddtBf.getMonth(),
				eddtBf.getDay(), 23, 59, 59);
		r.setDate($END_DT_CLM, eddt);
		if (!r.isStatusCreate()) {
			r.setStatus(Status.MODIFY);
		}
		return eddt;
	}

	protected MCDate createAfter(MCDBContainer nr, MCList<MCDBContainer> created, MCDate eddt2){
		// 開始日付の時分秒が00:00:00 を設定
		MCDate stdt = eddt2.trunc(MCDateFieldType.DAY).addDay(1);
		nr.setDate($ST_DT_CLM, stdt);
		nr.setStatus(Status.CREATE);
		created.add(nr);
		return stdt;
	}

	protected MCDate createDelAfter(MCDBContainer nr, MCList<MCDBContainer> created, MCDate eddt, MCDate eddt2){
		MCDate stdt = eddt.trunc(MCDateFieldType.DAY).addDay(1);
		nr.setDate($ST_DT_CLM, stdt);
		nr.setDate($END_DT_CLM, eddt2);
		nr.setDateNE($ST_DT_KEY_CLM, null);
		nr.setNumberNE($UPD_CNTR_CLM, null);
		nr.setStatus(Status.CREATE);
		created.add(nr);
		return stdt;
	}

	protected void addBeforeKeyColumns(MCDBContainer dest, boolean addValue) {

		for (String c : dest.getKeyColumn()) {
			String bc = FXBAL_MCRLUtil.getBeforeKeyColumn(c);
			Comparable<?> v = null;
			if (addValue) {
				v = dest.getValue(c);
			}
			dest.addValueColumn(bc, dest.getDataType(c), v);
		}
	}

	protected void clearBeforeKeyColumns(MCDBContainer dest) {

		for (String c : dest.getKeyColumn()) {
			String bc = FXBAL_MCRLUtil.getBeforeKeyColumn(c);
			Comparable<?> v = null;
			MCDataType dt = dest.getDataType(c);
			if (dt == MCDataType.BOOLEAN) {
				v = false;
			}
			dest.addValueColumn(bc, dest.getDataType(c), v);
		}
		// 既存行から分割されたデータ＝新規行なので更新カウンタクリア
		dest.setNumberNE($UPD_CNTR_CLM, null);
	}

	protected <E extends MCDBContainer>void copyBeforeKey(E dest, E src) {

		for (String c : FXBAL_MCRLUtil.getBeforeKeyColumns(src.getKeyColumn())) {
			dest.setValue(c, src.getValue(c));
		}
	}

	protected <E extends MCDBContainer>void copyKeyToBeforeKey(E dest, E src) {

		for (String c : src.getKeyColumn()) {
			String bc = FXBAL_MCRLUtil.getBeforeKeyColumn(c);
			dest.setValue(bc, src.getValue(c));
		}
	}

	protected <E extends MCDBContainer>void copyAllColsExptStEd(E dest, E src) {
		// Key項目の名称を設定する
		String[] updCols = getUpdColsExptStEd(src);
		String[] exptUpc = MCCollectionUtil.remove(src.getConstColumnPathArray(), 
				new String[0], updCols);
		Set<String> skipCols = new HashSet<>(Arrays.asList(src.getUpdSkipColumn()));
		
		for (String c : exptUpc) {
			if (!skipCols.contains(c) && 
					!$ST_DT_CLM.equals(c) && 
					!$END_DT_CLM.equals(c)){
				dest.setValue(c, src.getValue(c));
			}
		}
	}

	protected <E extends MCDBContainer>void copyUpdColsExptStEd(E dest, E src) {

		String[] existColumn = getUpdColsExptStEd(src);
		for (String c : existColumn) {
			dest.setValue(c, src.getValue(c));
		}
		dest.setStatus(Status.MODIFY);
	}

	protected void clearBeforeKey(MCDBContainer r) {
		for (String c : FXBAL_MCRLUtil.getBeforeKeyColumns(r.getKeyColumn())) {
			Comparable<?> v = null;
			MCDataType t = r.getDataType(c);
			if (t == MCDataType.BOOLEAN) {
				v = false;
			}
			r.addValueColumn(c, r.getDataType(c), v);
		}
	}

	protected boolean isDbRow(MCDBContainer r){
		return getStatusNoDB().eq(r.getNumber(ROW_STATUS_NO_COL_NAME));
	}

	/**
	 * 登録対象のベースキーで検索後、検索結果のリストに、登録時に影響を受ける予定のなかったデータのみを保持させた状態にします。<p>
	 * 検索結果に含まれるRowの全てに、変更前キー項目が追加され、キー項目が設定されます。
	 * 参照日時が更新日時よりも古いばあいエラーを返します。
	 * 
	 * @param builder 検索を行うクエリAPIビルダー
	 * @param srchList 検索結果を格納するリスト
	 * @param deleteOrModify 削除または更新対象
	 * @param supd 登録対象
	 * @param basekeyCols ベースキーカラム
	 * @param keyCols キーカラム
	 */
	protected void dbSelectUnaffectedInBaseKey(MCQueryApiBuilder builder,
			MCList<MCDBContainer> srchList,
			MCList<MCDBContainer> deleteOrModify,
			MCList<MCDBContainer> supd,
			String[] basekeyCols,
			String[] keyCols) {
		//--検索する
		String sqlid = createSqlId(LOGIC_ID, builder.getBaseDbc(), "S01");
		setWhereForBaseKey(builder, basekeyCols, supd);
		builder
			.buildSelect(sqlid)
			.executeQuery(supd.get(0), srchList);
		
		//--更新予定行を補正対象から外す
		String[] bks = getBeforeKeyCustom(keyCols);
		MCList<MCDBContainer> rmvs = srchList.createInstance();
		MCIndexKey bksIdxKey = deleteOrModify.createIndex(bks);
		for (MCDBContainer rmv : srchList) {
			MCRow d = deleteOrModify.getFirst(bksIdxKey, rmv.toArray(keyCols));
			if (d != null) {
				checkUpdCntr(d, rmv);

				//削除行は属性に値が入っていない場合があるので
				//データを全てコピーする。
				//ここよりも前でbeforekeyを検索結果に追加しないこと。
				if (d.isStatusDelete()) {
					d.setValuesByName(rmv);
				}
				rmvs.add(rmv);
			}
			else {
				addBeforeKeyColumns(rmv, true);
				rmv.setParamIndex(-1);
				rmv.setParamRowIndex(-1);
			}
		}
		srchList.removeAll(rmvs);
	}

	/**
	 * 変更可能なキー項目名配列にst_dtだけkeyを追加して返します。 
	 */
	protected String[] getBeforeKeyCustom(String[] keyCols) {
		String[] bk = new String[keyCols.length];

		for (int i = 0; i < keyCols.length; i++) {
			if(isSame(keyCols[i], $ST_DT_CLM)) {
				bk[i] = "st_dt_key";
			}
			else {
				bk[i] = keyCols[i];
			}
		}
		return bk;
	}

	/**
	 *「引数supdの保持するベースキーであり、supdの保持する最小の開始日と最大の終了日に含まれる」DB上のデータを取得する
	 * Where文を、引数builderに設定します。
	 * 
	 * @param builder 検索を行うクエリAPIビルダー（where句はクリア後に再設定されます）
	 * @param baseKeys ベースキー
	 * @param supd ベースキーの値が一致するRowコンテナを保持するリスト
	 */
	protected void setWhereForBaseKey(MCQueryApiBuilder builder, String[] baseKeys, MCList<MCDBContainer> supd){
		MCDBContainer baseDbc = builder.getBaseDbc();
		MCDateValue supdMin = value((MCDate) supd.min($ST_DT_CLM));
		MCDateValue supdMax = value((MCDate) supd.max($END_DT_CLM));
		MCDatePermColumn srchStDt = (MCDatePermColumn) baseDbc.getColumn$($ST_DT_CLM);
		MCDatePermColumn srchEndDt = (MCDatePermColumn) baseDbc.getColumn$($END_DT_CLM);
		// srchとsupdの日付比較用MCPredicate
		MCPredicate dateComparePred = srchStDt.between(supdMin, supdMax)
				.or(srchEndDt.between(supdMin, supdMax))
				.or(srchStDt.lt(supdMin)
						.and(srchEndDt.gt(supdMax)));

		builder.clearConstWhere();
		builder.addConstWhereWithAnd(dateComparePred);
	}
	//FMCB CUSTOM END
}