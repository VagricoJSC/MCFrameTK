package mcframe.serverMBBC.MBBCL0020;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MBBCL_AttachmentLstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBCL_AttachmentLstReg_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBCL0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBCL_AttachmentLstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MB_MBBCL0020_Srch01_INFO;
		this.aSrch01 = ((MBBCL_AttachmentLstReg)this).new Srch01();
	}

	public static MBBCL_AttachmentLstReg.Srch01 crtSrch01() {
		MBBCL_AttachmentLstReg lgc = new MBBCL_AttachmentLstReg();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL0020.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMBBC.MBBCL0020.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL0020.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMBBC.MBBCL0020.Srch01_RsltR.class);
	}
	protected MBBCL_AttachmentLstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MB_MBBCL0020_Upd01_INFO;
		this.aUpd01 = ((MBBCL_AttachmentLstReg)this).new Upd01();
	}

	public static MBBCL_AttachmentLstReg.Upd01 crtUpd01() {
		MBBCL_AttachmentLstReg lgc = new MBBCL_AttachmentLstReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL0020.Upd01_DtlR createUpd01_DtlR(){
		return mcframe.serverMBBC.MBBCL0020.Upd01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL0020.Upd01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMBBC.MBBCL0020.Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 添付ファイル情報を検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL0020.Srch01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL0020.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBC.MBBCL0020.Srch01_RsltR.class);
			down0 = MCList.create(mcframe.serverMBBC.MBBCL0020.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBCL_AttachmentLstReg)MBBCL_AttachmentLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL0020.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMBBC.MBBCL0020.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL0020.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMBBC.MBBCL0020.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL0020.Srch01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>archive_flg</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>edition</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>fs_flg</td></tr>
		 * 	<tr><td><br></td><td>doc_id</td></tr>
		 * 	<tr><td><br></td><td>preview_url</td></tr>
		 * 	<tr><td><br></td><td>rmrks1</td></tr>
		 * 	<tr><td><br></td><td>rmrks2</td></tr>
		 * 	<tr><td><br></td><td>rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rmrks4</td></tr>
		 * 	<tr><td><br></td><td>rmrks5</td></tr>
		 * 	<tr><td><br></td><td>file_path</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr1</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr2</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr3</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr4</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr5</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr6</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr7</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr8</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr9</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr10</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr11</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr12</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr13</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr14</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr15</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr16</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr17</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr18</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr19</td></tr>
		 * 	<tr><td><br></td><td>rpt_attr20</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL0020.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_AttachmentLstReg)MBBCL_AttachmentLstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 添付ファイル情報を登録または更新する<br>
	 */
	abstract public class Upd01 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL0020.Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL0020.Upd01_DtlR> down0;
		
		/**
		 * 連携情報 AT<p>
		 *
		 * 連携先 mcframe.serverMBBC.MBBCL5020.MBBCL_AttachService.Attach_Upd01 （{@link #so01}）<br>
		 */
		public final String AT = "AT";

		/**
		 * 連携オペレーション so01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMBBC.MBBCL5020.MBBCL_AttachService.Attach_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR&gt; （{@link #so01_up0}）<br>
		 */
		public final mcframe.serverMBBC.MBBCL5020.MBBCL_AttachService.Attach_Upd01 so01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> so01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBC.MBBCL0020.Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBC.MBBCL0020.Upd01_DtlR.class);

			// 連携オペレーションの初期化
			so01 = mcframe.serverMBBC.MBBCL5020.MBBCL_AttachService.crtAttach_Upd01();
			
			// 連携オペレーションのコンテナ取得
			so01_up0 = (MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR>)so01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(AT, so01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * AT<br>
		 * up0() => MCList&lt;mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR&gt; （{@link #so01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(AT)) {
				up_AT(so01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * AT<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(AT)) {
				down_AT();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBCL_AttachmentLstReg)MBBCL_AttachmentLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL0020.Upd01_DtlR createUpd01_DtlR(){
			return mcframe.serverMBBC.MBBCL0020.Upd01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL0020.Upd01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMBBC.MBBCL0020.Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>edition</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>select_file_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_file_flg</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>rmrks1</td></tr>
		 * 	<tr><td><br></td><td>rmrks2</td></tr>
		 * 	<tr><td><br></td><td>rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rmrks4</td></tr>
		 * 	<tr><td><br></td><td>rmrks5</td></tr>
		 * 	<tr><td><br></td><td>file_bin</td></tr>
		 * 	<tr><td><br></td><td>file_path</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL0020.Upd01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL0020.Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_AttachmentLstReg)MBBCL_AttachmentLstReg_MC_A.this).info;
		}

		//-----------------------AT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループATの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_AT(MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> dest0_0, MCList<mcframe.serverMBBC.MBBCL0020.Upd01_DtlR> src_Upd01_Dtl){
			up_AT_so01_0(dest0_0, src_Upd01_Dtl);
		}
		
		/**
		 * 連携処理AT_so01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_AT_so01_0() {
			MCRowMapper map = new Map_up_AT_so01_0();
			return map;
		}

		/**
		 * 連携処理AT_so01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_AT_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("edition", "edition");
				addColumnPathMap("biz_typ", "biz_typ");
				addColumnPathMap("select_file_flg", "select_file_flg");
				addColumnPathMap("attach_file_flg", "attach_file_flg");
				addColumnPathMap("biz_key1", "biz_key1");
				addColumnPathMap("biz_key2", "biz_key2");
				addColumnPathMap("biz_key3", "biz_key3");
				addColumnPathMap("biz_key4", "biz_key4");
				addColumnPathMap("biz_key5", "biz_key5");
				addColumnPathMap("biz_key6", "biz_key6");
				addColumnPathMap("biz_key7", "biz_key7");
				addColumnPathMap("biz_key8", "biz_key8");
				addColumnPathMap("biz_key9", "biz_key9");
				addColumnPathMap("biz_key10", "biz_key10");
				addColumnPathMap("dt", "dt");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("amt", "amt");
				addColumnPathMap("rmrks1", "rmrks1");
				addColumnPathMap("rmrks2", "rmrks2");
				addColumnPathMap("rmrks3", "rmrks3");
				addColumnPathMap("rmrks4", "rmrks4");
				addColumnPathMap("rmrks5", "rmrks5");
				addColumnPathMap("file_bin", "file_bin");
				addColumnPathMap("file_path", "file_path");
				addColumnPathMap("file_nm", "file_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("purc_dpt_cd", "purc_dpt_cd");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("bill_dpt_cd", "bill_dpt_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("tterm_cd1", "tterm_cd1");
				addColumnPathMap("tterm_cd2", "tterm_cd2");
				addColumnPathMap("tterm_cd3", "tterm_cd3");
				addColumnPathMap("edi_sub_char1", "edi_sub_char1");
				addColumnPathMap("edi_sub_char2", "edi_sub_char2");
				addColumnPathMap("edi_sub_char3", "edi_sub_char3");
				addColumnPathMap("edi_sub_char4", "edi_sub_char4");
				addColumnPathMap("edi_sub_char5", "edi_sub_char5");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理AT_so01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_AT_so01_0(mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR r_dest, mcframe.serverMBBC.MBBCL0020.Upd01_DtlR r_src) {
		}

		/**
		 * 連携処理AT_so01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_AT_so01_0(MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> dest, MCList<mcframe.serverMBBC.MBBCL0020.Upd01_DtlR> src) {
			MCRowMapper _rm = createMap_up_AT_so01_0();
			for(mcframe.serverMBBC.MBBCL0020.Upd01_DtlR r_src : src){
				mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_AT_so01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------AT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループATの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_AT(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}