package mcframe.serverMABC.MABCL0800;

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
import mcframe.serverMABC.MABCL0800.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SeqReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SeqReg_MC extends MABCL_SeqReg_MC_A{
	//FMCB CUSTOM START

	private int _maxElmDgt = 0;
	
	protected void setMaxElmDgt(int maxElmDgt) {
		_maxElmDgt = maxElmDgt;
	}
	
	protected int getMaxElmDgt() {
		return _maxElmDgt;
	}

	/**
	 * Seq_UpdChk01オペレーション.<p>
	 *
	 * 発番情報の登録前のチェックを行います。<br>
	 */
	public class Seq_UpdChk01 extends MABCL_SeqReg_MC_A.Seq_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override		
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();	
			// 条件付リストロジックチェックの処理	
			ListLogicBind actDptBind = getListLogicBind(up0(), Seq_UpdChk01_DtlR.$num_ptn_cd);	
			actDptBind.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.NumPtnCols.$i_num_biz_typ, Seq_UpdChk01_DtlR.$num_biz_typ);	
		}

		@Override
		protected MCMessageList doServerCheckSub() {
		    
			MCMessageList msgList = super.doServerCheckSub();
			for(Seq_UpdChk01_DtlR row : up0()){
				if(!isNullOr(row.min_val(), row.max_val())){
					if(!isNull(row.increment_by()) && row.max_val().add(row.min_val().negate()).lte(row.increment_by())){
						MCMessage msg = new MCMessage(row, null, MABCL0146, row.increment_by(), toDispGUIIndex(row));
						msgList.add(msg);
					}
				}
				checkMaxVal(row, msgList);
			}

			return msgList;
		}

		protected void checkMaxVal(Seq_UpdChk01_DtlR r, MCMessageList msgList){
			
			MAM_NUM_PTN_R chk = MAM_NUM_PTN_R.create();
			MCQueryApiBuilder chk_bldr = MCQueryApiBuilder.create(MAM_NUM_PTN_R.create("T"));
			int tmpMaxDgt = 0;
			chk_bldr.setSelectAll();
			dbSelectKey("MABCL0800_MAM_NUM_PTN_S01", chk, chk_bldr, r);
			
			if(!isNull(r.max_val()) ) {
				tmpMaxDgt = r.max_val().toString().length();
				String ELM_TYP = MAM_NUM_PTN_R.$elm_typ1.substring(0, MAM_NUM_PTN_R.$elm_typ1.length() - 1);
				String ELM_DGT = MAM_NUM_PTN_R.$elm_dgt1.substring(0, MAM_NUM_PTN_R.$elm_dgt1.length() - 1);
				for (int i=1; i <= 10; i++) {
					if(MAC_ELM_TYP.isSEQ(chk.getStringNE(ELM_TYP + i)) &&
						!isNull(chk.getNumberNE(ELM_DGT + i))) {
						
						setMaxElmDgt(chk.getNumberNE(ELM_DGT + i).intValue());

						if (chk.getNumberNE(ELM_DGT + i).lt(tmpMaxDgt)) {
							MCMessage msg = new MCMessage(r, null, MABCL0148, getMaxElmDgt(), toDispGUIIndex(r));
							msgList.add(msg);
						}
					}
				}
			}
		}
	}

	/**
	 * Seq_Upd01オペレーション.<p>
	 *
	 * 発番情報の登録を行います。<br>
	 */
	public class Seq_Upd01 extends MABCL_SeqReg_MC_A.Seq_Upd01 {

		/**
		 * シーケンス更新用のトランザクションです。
		 */
		MCDBTransaction _seqtran;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			callSub();
		}
		
		protected void callSub(){
			try {
				for(Seq_UpdChk01_DtlR row : up0()){
					MAT_SEQ_R r = MAT_SEQ_R.create();
					copy(r, row, createMap_MAT_SEQ_R_Seq_UpdChk01_DtlR());
					update(r, row.num_upd_flg(), row.seq_typ());
				}
			}
			finally {
				_seqtran = null;
			}
		}
		
		protected void update(MAT_SEQ_R r, boolean numUpdFlg, String seqTyp){
			if(MAC_SEQ_TYP.isORA_SEQ(r.seq_typ())){
				updateOraSeq(r, numUpdFlg);
			}
			else{
				updateTblSeq(r, numUpdFlg, seqTyp);
			}
		}

		protected void updateOraSeq(MAT_SEQ_R r, boolean numUpdFlg){

			if (_seqtran == null) {
				_seqtran = MCTransactionManager.createDBTran(false);
			}
			
			MAT_SEQ_R l = MAT_SEQ_R.create();
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(MAT_SEQ_R.create("T"));
			dbSelectKeyForUpdateNoWait("MABCL0800_MAT_SEQ_S01", l, l_bldr, r);
			
			//何も変更なし（無駄な処理を回避）
			if(MAC_SEQ_TYP.isORA_SEQ(l.seq_typ()) && !numUpdFlg){
				return;
			}

			//ora_seqのままかつnum_upd_flg=true
			//またはtbl_seqからora_seqへ変更
			if(isNull(r.ora_seq_nm())){
				r.ora_seq_nm(getOraSeqNm());
			}
			
			MAT_SEQ_R d = r.clone();
			
			for(String c : getNoUpdColumns()){
				if(MCDataType.BOOLEAN == r.getDataType(c)){
					d.setValue(c, false);
				}
				else{
					d.setValue(c, null);
				}
			}
			
			dbUpdateKey("MABCL0800_MAT_SEQ_U01", d, l_bldr);
			
			dbDeleteOraSequence(l, _seqtran);
			dbCreateOraSequence(r, _seqtran);
		}
		protected void updateTblSeq(MAT_SEQ_R r, boolean numUpdFlg, String seqTyp){
			
			MAT_SEQ_R l = MAT_SEQ_R.create();
			MAT_SEQ_R t = MAT_SEQ_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			dbSelectKeyForUpdateNoWait("MABCL0800_MAT_SEQ_S02", l, l_bldr, r);
			
			if(!numUpdFlg){
				// メモ：番号更新がオフの場合は、シーケンス区分以外は
				// 変更できない前提で実装をしている。前提が変わったら要実装見直し
				if (isSame(l.seq_typ(), seqTyp)) {
					//何も変更なし（無駄な処理を回避）
					return;
				}
				l_bldr.setSet(t.seq_typ);
			}
			
			//tbl_seqのままかつnum_upd_flg=true
			//またはora_seqからtbl_seqへ変更
			r.ora_seq_nm(null);
			dbUpdateKey("MABCL0800_MAT_SEQ_U02", r, l_bldr);
			if (!isNull(l.ora_seq_nm())) {
				if (_seqtran == null) {
					_seqtran = MCTransactionManager.createDBTran(false);
				}
				dbDeleteOraSequence(l, _seqtran);
			}
		}
	}
	/**
	 * Seq_DelChk01オペレーション.<p>
	 *
	 * 発番情報の削除前のチェックを行います。<br>
	 */
	public class Seq_DelChk01 extends MABCL_SeqReg_MC_A.Seq_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Seq_Del01オペレーション.<p>
	 *
	 * 発番情報の削除を行います。<br>
	 */
	public class Seq_Del01 extends MABCL_SeqReg_MC_A.Seq_Del01 {
		
		/**
		 * シーケンス更新用のトランザクションです。
		 */
		MCDBTransaction _seqtran;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			callSub();
		}
		
		protected void callSub(){
			try {
				for(Seq_DelChk01_DtlR row : up0()){
					MAT_SEQ_R r = MAT_SEQ_R.create();
					copy(r, row, createMap_MAT_SEQ_R_Seq_DelChk01_DtlR());
					delete(r);
				}
			}
			finally {
				_seqtran = null;
			}
		}

		protected void delete(MAT_SEQ_R r){
			if(MAC_SEQ_TYP.isORA_SEQ(r.seq_typ())){
				if (_seqtran == null) {
					_seqtran = MCTransactionManager.createDBTran(false);
				}
				dbDeleteOraSequence(r, _seqtran);
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 発番情報マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_SeqReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		protected boolean _nonNumPtn;
		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			_nonNumPtn = ((Srch01_CndR)cond).non_num_ptn();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeSub(builder);
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAT_SEQ_R t = (MAT_SEQ_R)builder.getBaseDbc();
			MAM_NUM_PTN_R num_ptn1 = MAM_NUM_PTN_R.create("NUM_PTN1");
			
			builder.setSelect(t.getKeyColumn$());
			builder.activeForeign("NUM_PTN1");
			builder.addSelect(num_ptn1.num_ptn_nm);
			builder.addSelect(t.seq_typ);
			builder.addSelect(t.ins_usr_id);
			builder.addSelect(t.ins_usr_nm); 
			builder.addSelect(t.ins_ts);
			builder.addSelect(t.ins_func_id);
			builder.addSelect(t.upd_cntr); 
			builder.addSelect(t.upd_usr_id); 
			builder.addSelect(t.upd_usr_nm);
			builder.addSelect(t.upd_ts);
			builder.addSelect(t.upd_func_id);
			builder.addSelect(t.upd_srv_req_no);
			builder.addSelect(t.ora_seq_nm);
			builder.addSelect(t.max_val);
			builder.addSelect(t.min_val);
			builder.addSelect(t.increment_by);
			builder.addSelect(t.cycl_flg);
			builder.addSelect(t.last_val);

			if (_nonNumPtn) {
				MAM_NUM_PTN_R S1P = MAM_NUM_PTN_R.create("P");
				builder.addWhereWithAnd(notExists(subQuery().select(value("dummy"))
						.from(S1P).where(S1P.num_biz_typ.eq(t.num_biz_typ)
								.and(S1P.num_ptn_cd.eq(t.num_ptn_cd)))));
			}
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MAT_SEQ_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);
			// シーケンス区分変更前
			r_dest.seq_typ_old(r_src.getStringNE("seq_typ"));
		}

		@Override
		protected <R extends MCDBContainer> void afterSelect(MCList<R> rslt) {
			super.afterSelect(rslt);
			
			afterSelectSub(rslt);
		}
		protected <R extends MCDBContainer> void afterSelectSub(MCList<R> rslt) {
			for (R r : rslt) {
				if (MAC_SEQ_TYP.isORA_SEQ(r.getString("seq_typ"))) {
					String sql;
					String sqlid;
					if (MCDatabaseManager.isOracle()) {
						sql = "SELECT MAX_VALUE MAX_VAL, MIN_VALUE MIN_VAL, INCREMENT_BY, DECODE(CYCLE_FLAG,'Y','1','0') CYCL_FLG, LAST_NUMBER LAST_VAL FROM USER_SEQUENCES WHERE SEQUENCE_NAME = :ORA_SEQ_NM";
						sqlid = "USER_SEQUENCES";
					}
					else {
						sql = "SELECT MAXIMUM_VALUE MAX_VAL, MINIMUM_VALUE MIN_VAL, INCREMENT INCREMENT_BY, CASE CYCLE_OPTION WHEN 'NO' THEN '0' ELSE '1' END CYCL_FLG FROM INFORMATION_SCHEMA.SEQUENCES WHERE SEQUENCE_NAME = LOWER(:ORA_SEQ_NM)";
						sqlid = "INFORMATION_SCHEMA.SEQUENCES";
					}
					MCTransactionManager.dbTran().statement().executeQuery(createSqlId(LOGIC_ID, sqlid, "S01"), sql, r, null, null, r);
					
					// PostgreのシーケンスのLAST_VALUEの取得
					if (MCDatabaseManager.isPostgreSql() && !isNull(r.getNumber("max_val"))) {
						sql = "SELECT LAST_VALUE LAST_VAL FROM " + r.getString("ora_seq_nm");
						MCTransactionManager.dbTran().statement().executeQuery(createSqlId(LOGIC_ID, r.getString("ora_seq_nm"), "S50"), sql, r, null, null, r);
					}
				}
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 発番情報マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_SeqReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 発番情報マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_SeqReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	protected String[] getNoUpdColumns(){
		return _noUpdColumns;
	}
	
	protected String[] _noUpdColumns = new String[]{
			MAT_SEQ_R.$max_val,
			MAT_SEQ_R.$min_val,
			MAT_SEQ_R.$cycl_flg,
			MAT_SEQ_R.$increment_by,
			MAT_SEQ_R.$last_val
			
	};
	
	/**
	 * 別セッションでシーケンスを削除後セッションを元に戻します。<p>
	 * シーケンスが存在しなければ何もしません。
	 * @param r
	 */
	protected void dbDeleteOraSequence(MAT_SEQ_R r, MCDBTransaction seqTran){

		int cnt = dbCountSequence(r);
		
		if(0 < cnt){
			String sql;
			sql = getDeleteSequence(r);
			seqTran.statement().executeUpdate("MABCL0800_MAT_SEQ_U03", sql, null, null);
			// Oracle Databaseと合わせるため、DDL文の後はコミットする。
			seqTran.commit();
		}
	}
	/**
	 * 別セッションでシーケンスを作成後セッションを元に戻します。<p>
	 * シーケンスが存在する場合は何もしません。
	 * @param r
	 */	
	protected void dbCreateOraSequence(MAT_SEQ_R r, MCDBTransaction seqTran){
		
		int cnt = dbCountSequence(r);
		
		if(cnt <= 0){
			String sql;
			sql = getCreateSequence(r);
			seqTran.statement().executeUpdate("MABCL0800_MAT_SEQ_U04", sql, null, null);
			// Oracle Databaseと合わせるため、DDL文の後はコミットする。
			seqTran.commit();
		}
	}
	
	protected int dbCountSequence(MAT_SEQ_R r){
		String sql;
		String sqlid;
		if (MCDatabaseManager.isOracle()) {
			sql = "SELECT 'dummy' FROM USER_SEQUENCES WHERE sequence_name = :ora_seq_nm";
			sqlid = "USER_SEQUENCES";
		}
		else {
			sql = "SELECT 'dummy' FROM INFORMATION_SCHEMA.SEQUENCES WHERE sequence_name = LOWER(:ora_seq_nm)";
			sqlid = "INFORMATION_SCHEMA.SEQUENCES";
		}
		return MCTransactionManager.dbTran().statement().executeQuery(createSqlId(LOGIC_ID,  sqlid, "S02"), sql, r, null, null, MCRow.create());
	}
	
	protected String getDeleteSequence(MAT_SEQ_R r){
		return "DROP SEQUENCE " + r.ora_seq_nm();
	}
	
	protected String getCreateSequence(MAT_SEQ_R r){
		String oraSeqNm = r.ora_seq_nm();
		
		String cycle = null;
		if(r.cycl_flg()){
			cycle = "CYCLE";
		}
		else{
			if (MCDatabaseManager.isOracle()) {
				cycle = "NOCYCLE";
			}
			else {
				cycle = "NO CYCLE";
			}
		}
		
		StringBuilder sb = new StringBuilder().append("CREATE SEQUENCE ").append(oraSeqNm)
				.append("\r\f").append("INCREMENT BY ").append(r.increment_by())
				.append("\r\f").append("START WITH ").append(r.last_val().add(1))
				.append("\r\f").append("MAXVALUE ").append(r.max_val()).append("\r\f")
				.append("MINVALUE ").append(r.min_val()).append("\r\f").append(cycle);
		if (MCDatabaseManager.isOracle()) {
			sb.append("\r\f").append(MAC_NUM_PROC.ORA_SEQ_OPT.value());
		}
		return sb.toString();
	}
	
	protected String getOraSeqNm(){
		return execFuncString(createSqlId(LOGIC_ID, "MAPA_NUM$F_GET_NEW_ORA_SEQ_NM", "01"), MAPA_NUM$F_GET_NEW_ORA_SEQ_NM());
	}
	
	protected Map_MAT_SEQ_R_Seq_UpdChk01_DtlR<MAT_SEQ_R,Seq_UpdChk01_DtlR> createMap_MAT_SEQ_R_Seq_UpdChk01_DtlR() {
		return new Map_MAT_SEQ_R_Seq_UpdChk01_DtlR<MAT_SEQ_R, Seq_UpdChk01_DtlR>();
	}

	public class Map_MAT_SEQ_R_Seq_UpdChk01_DtlR<D extends MAT_SEQ_R, S extends Seq_UpdChk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAT_SEQ_R.$num_biz_typ, Seq_UpdChk01_DtlR.$num_biz_typ);
			addColumnPathMap(MAT_SEQ_R.$num_ptn_cd, Seq_UpdChk01_DtlR.$num_ptn_cd);
			addColumnPathMap(MAT_SEQ_R.$key_elm, Seq_UpdChk01_DtlR.$key_elm);
			addColumnPathMap(MAT_SEQ_R.$seq_typ, Seq_UpdChk01_DtlR.$seq_typ);
			addColumnPathMap(MAT_SEQ_R.$ora_seq_nm, Seq_UpdChk01_DtlR.$ora_seq_nm);
			addColumnPathMap(MAT_SEQ_R.$min_val, Seq_UpdChk01_DtlR.$min_val);
			addColumnPathMap(MAT_SEQ_R.$max_val, Seq_UpdChk01_DtlR.$max_val);
			addColumnPathMap(MAT_SEQ_R.$increment_by, Seq_UpdChk01_DtlR.$increment_by);
			addColumnPathMap(MAT_SEQ_R.$cycl_flg, Seq_UpdChk01_DtlR.$cycl_flg);
			addColumnPathMap(MAT_SEQ_R.$last_val, Seq_UpdChk01_DtlR.$last_val);
			addColumnPathMap(MAT_SEQ_R.$upd_cntr, Seq_UpdChk01_DtlR.$upd_cntr);
		}
	}

	protected Map_MAT_SEQ_R_Seq_DelChk01_DtlR<MAT_SEQ_R,Seq_DelChk01_DtlR> createMap_MAT_SEQ_R_Seq_DelChk01_DtlR() {
		return new Map_MAT_SEQ_R_Seq_DelChk01_DtlR<MAT_SEQ_R, Seq_DelChk01_DtlR>();
	}

	public class Map_MAT_SEQ_R_Seq_DelChk01_DtlR<D extends MAT_SEQ_R, S extends Seq_DelChk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAT_SEQ_R.$num_biz_typ, Seq_DelChk01_DtlR.$num_biz_typ);
			addColumnPathMap(MAT_SEQ_R.$num_ptn_cd, Seq_DelChk01_DtlR.$num_ptn_cd);
			addColumnPathMap(MAT_SEQ_R.$key_elm, Seq_DelChk01_DtlR.$key_elm);
			addColumnPathMap(MAT_SEQ_R.$seq_typ, Seq_DelChk01_DtlR.$seq_typ);
			addColumnPathMap(MAT_SEQ_R.$ora_seq_nm, Seq_DelChk01_DtlR.$ora_seq_nm);
			addColumnPathMap(MAT_SEQ_R.$upd_cntr, Seq_DelChk01_DtlR.$upd_cntr);
		}
	}

	//FMCB CUSTOM END
}