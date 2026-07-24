package mcframe.serverMBBE.MBBEL0050;

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
 * "MBBEL_BizDatDLHstSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEL_BizDatDLHstSrch_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBEL0050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBEL_BizDatDLHstSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MB_MBBEL0050_Srch01_INFO;
		this.aSrch01 = ((MBBEL_BizDatDLHstSrch)this).new Srch01();
	}

	public static MBBEL_BizDatDLHstSrch.Srch01 crtSrch01() {
		MBBEL_BizDatDLHstSrch lgc = new MBBEL_BizDatDLHstSrch();
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
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0050.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMBBE.MBBEL0050.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0050.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMBBE.MBBEL0050.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0050.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0050.Srch01_RsltR.class);
	}
	protected MBBEL_BizDatDLHstSrch.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MB_MBBEL0050_Upd01_INFO;
		this.aUpd01 = ((MBBEL_BizDatDLHstSrch)this).new Upd01();
	}

	public static MBBEL_BizDatDLHstSrch.Upd01 crtUpd01() {
		MBBEL_BizDatDLHstSrch lgc = new MBBEL_BizDatDLHstSrch();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0050.Upd01_DtlR createUpd01_DtlR(){
		return mcframe.serverMBBE.MBBEL0050.Upd01_DtlR.create();
	}
	protected MBBEL_BizDatDLHstSrch.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MB_MBBEL0050_Chk01_INFO;
		this.aChk01 = ((MBBEL_BizDatDLHstSrch)this).new Chk01();
	}

	public static MBBEL_BizDatDLHstSrch.Chk01 crtChk01() {
		MBBEL_BizDatDLHstSrch lgc = new MBBEL_BizDatDLHstSrch();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0050.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.class);
	}
	protected MBBEL_BizDatDLHstSrch.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MB_MBBEL0050_Del01_INFO;
		this.aDel01 = ((MBBEL_BizDatDLHstSrch)this).new Del01();
	}

	public static MBBEL_BizDatDLHstSrch.Del01 crtDel01() {
		MBBEL_BizDatDLHstSrch lgc = new MBBEL_BizDatDLHstSrch();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0050.Chk01_DtlR createDel01_DtlR(){
		return mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 業務データダウンロード履歴を検索する<br>
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
		private final mcframe.serverMBBE.MBBEL0050.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0050.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0050.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0050.Srch01_RsltR.class);

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
			invoke((MBBEL_BizDatDLHstSrch)MBBEL_BizDatDLHstSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0050.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMBBE.MBBEL0050.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0050.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMBBE.MBBEL0050.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0050.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0050.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>running_flg</td></tr>
		 * 	<tr><td><br></td><td>success_flg</td></tr>
		 * 	<tr><td><br></td><td>download_flg</td></tr>
		 * 	<tr><td><br></td><td>error_flg</td></tr>
		 * 	<tr><td><br></td><td>excel_flg</td></tr>
		 * 	<tr><td><br></td><td>csv_flg</td></tr>
		 * 	<tr><td><br></td><td>report_flg</td></tr>
		 * 	<tr><td><br></td><td>screen_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_st_tm_fr</td></tr>
		 * 	<tr><td><br></td><td>proc_st_tm_to</td></tr>
		 * 	<tr><td><br></td><td>proc_end_tm_fr</td></tr>
		 * 	<tr><td><br></td><td>proc_end_tm_to</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>dl_tm_fr</td></tr>
		 * 	<tr><td><br></td><td>dl_tm_to</td></tr>
		 * 	<tr><td><br></td><td>dl_file_nm</td></tr>
		 * 	<tr><td><br></td><td>file_size_fr</td></tr>
		 * 	<tr><td><br></td><td>file_size_to</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_dl_cond</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0050.Srch01_CndR
		 */
		public mcframe.serverMBBE.MBBEL0050.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_dl_hst_no</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_file_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_file_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_dl_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_dl_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>proc_st_tm</td></tr>
		 * 	<tr><td><br></td><td>proc_end_tm</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_dl_cond</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>file_bin</td></tr>
		 * 	<tr><td><br></td><td>file_size</td></tr>
		 * 	<tr><td><br></td><td>data_cnt</td></tr>
		 * 	<tr><td><br></td><td>dl_tm</td></tr>
		 * 	<tr><td><br></td><td>dl_file_path</td></tr>
		 * 	<tr><td><br></td><td>dl_file_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0050.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BizDatDLHstSrch)MBBEL_BizDatDLHstSrch_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 業務データダウンロード履歴を更新する<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
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
		private final mcframe.serverMBBE.MBBEL0050.Upd01_DtlR up0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0050.Upd01_DtlR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBEL_BizDatDLHstSrch)MBBEL_BizDatDLHstSrch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0050.Upd01_DtlR createUpd01_DtlR(){
			return mcframe.serverMBBE.MBBEL0050.Upd01_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_dl_hst_no</td></tr>
		 * 	<tr><td><br></td><td>dl_file_path</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0050.Upd01_DtlR
		 */
		public mcframe.serverMBBE.MBBEL0050.Upd01_DtlR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BizDatDLHstSrch)MBBEL_BizDatDLHstSrch_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 削除前チェック処理をする<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.class);

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
			invoke((MBBEL_BizDatDLHstSrch)MBBEL_BizDatDLHstSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0050.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_dl_hst_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_dl_hst_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BizDatDLHstSrch)MBBEL_BizDatDLHstSrch_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 業務データダウンロード履歴を削除する<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.class);

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
			invoke((MBBEL_BizDatDLHstSrch)MBBEL_BizDatDLHstSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0050.Chk01_DtlR createDel01_DtlR(){
			return mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0050.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_dl_hst_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> up0() {
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
		public MCList<mcframe.serverMBBE.MBBEL0050.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BizDatDLHstSrch)MBBEL_BizDatDLHstSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}