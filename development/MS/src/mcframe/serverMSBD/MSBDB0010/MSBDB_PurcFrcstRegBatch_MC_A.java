package mcframe.serverMSBD.MSBDB0010;

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
 * "MSBDB_PurcFrcstRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDB_PurcFrcstRegBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Ins01 aPurcFrcstReg_Ins01;

	protected void initPurcFrcstReg_Ins01() {
		this.info = PDef.MS_MSBDB0010_PurcFrcstReg_Ins01_INFO;
		this.aPurcFrcstReg_Ins01 = ((MSBDB_PurcFrcstRegBatch)this).new PurcFrcstReg_Ins01();
	}

	public static MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Ins01 crtPurcFrcstReg_Ins01() {
		MSBDB_PurcFrcstRegBatch lgc = new MSBDB_PurcFrcstRegBatch();
		lgc.initPurcFrcstReg_Ins01();
		return lgc.aPurcFrcstReg_Ins01;
	}

	protected void paramPurcFrcstReg_Ins01(MCParam p) {
		if (this.aPurcFrcstReg_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcstReg_Ins01.up0());
	}

	protected void doPurcFrcstReg_Ins01() {
		aPurcFrcstReg_Ins01.call();
	};

	/**
	 * PurcFrcstReg_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR createPurcFrcstReg_Ins01_CndR(){
		return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
	}
	protected MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Ins02 aPurcFrcstReg_Ins02;

	protected void initPurcFrcstReg_Ins02() {
		this.info = PDef.MS_MSBDB0010_PurcFrcstReg_Ins02_INFO;
		this.aPurcFrcstReg_Ins02 = ((MSBDB_PurcFrcstRegBatch)this).new PurcFrcstReg_Ins02();
	}

	public static MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Ins02 crtPurcFrcstReg_Ins02() {
		MSBDB_PurcFrcstRegBatch lgc = new MSBDB_PurcFrcstRegBatch();
		lgc.initPurcFrcstReg_Ins02();
		return lgc.aPurcFrcstReg_Ins02;
	}

	protected void paramPurcFrcstReg_Ins02(MCParam p) {
		if (this.aPurcFrcstReg_Ins02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcstReg_Ins02.up0());
		p.addDownBlock(aPurcFrcstReg_Ins02.down0());
	}

	protected void doPurcFrcstReg_Ins02() {
		aPurcFrcstReg_Ins02.call();
	};

	/**
	 * PurcFrcstReg_Ins02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR createPurcFrcstReg_Ins02_CndR(){
		return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
	}

	/**
	 * PurcFrcstReg_Ins02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR createPurcFrcstReg_Ins02_RsltR(){
		return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR.create();
	}
	protected MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Del01 aPurcFrcstReg_Del01;

	protected void initPurcFrcstReg_Del01() {
		this.info = PDef.MS_MSBDB0010_PurcFrcstReg_Del01_INFO;
		this.aPurcFrcstReg_Del01 = ((MSBDB_PurcFrcstRegBatch)this).new PurcFrcstReg_Del01();
	}

	public static MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Del01 crtPurcFrcstReg_Del01() {
		MSBDB_PurcFrcstRegBatch lgc = new MSBDB_PurcFrcstRegBatch();
		lgc.initPurcFrcstReg_Del01();
		return lgc.aPurcFrcstReg_Del01;
	}

	protected void paramPurcFrcstReg_Del01(MCParam p) {
		if (this.aPurcFrcstReg_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcstReg_Del01.up0());
	}

	protected void doPurcFrcstReg_Del01() {
		aPurcFrcstReg_Del01.call();
	};

	/**
	 * PurcFrcstReg_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR createPurcFrcstReg_Del01_CndR(){
		return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
	}
	protected MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Del02 aPurcFrcstReg_Del02;

	protected void initPurcFrcstReg_Del02() {
		this.info = PDef.MS_MSBDB0010_PurcFrcstReg_Del02_INFO;
		this.aPurcFrcstReg_Del02 = ((MSBDB_PurcFrcstRegBatch)this).new PurcFrcstReg_Del02();
	}

	public static MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Del02 crtPurcFrcstReg_Del02() {
		MSBDB_PurcFrcstRegBatch lgc = new MSBDB_PurcFrcstRegBatch();
		lgc.initPurcFrcstReg_Del02();
		return lgc.aPurcFrcstReg_Del02;
	}

	protected void paramPurcFrcstReg_Del02(MCParam p) {
		if (this.aPurcFrcstReg_Del02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcstReg_Del02.up0());
		p.addDownBlock(aPurcFrcstReg_Del02.down0());
	}

	protected void doPurcFrcstReg_Del02() {
		aPurcFrcstReg_Del02.call();
	};

	/**
	 * PurcFrcstReg_Del02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR createPurcFrcstReg_Del02_CndR(){
		return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
	}

	/**
	 * PurcFrcstReg_Del02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR createPurcFrcstReg_Del02_RsltR(){
		return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PurcFrcstReg_Ins01オペレーション.<p>
	 *
	 * 購買内示情報を登録する。<br>
	 */
	abstract public class PurcFrcstReg_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcstReg_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected PurcFrcstReg_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();

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
			invoke((MSBDB_PurcFrcstRegBatch)MSBDB_PurcFrcstRegBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PurcFrcstReg_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR createPurcFrcstReg_Ins01_CndR(){
			return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>except_prcd_ord_flg</td></tr>
		 * 	<tr><td><br></td><td>except_opn_ord_flg</td></tr>
		 * 	<tr><td><br></td><td>except_sav_ord_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDB_PurcFrcstRegBatch)MSBDB_PurcFrcstRegBatch_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcstReg_Ins02オペレーション.<p>
	 *
	 * 発注先単位で購買内示情報の登録処理を行う。<br>
	 */
	abstract public class PurcFrcstReg_Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcstReg_Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR down0;
		
		
		// コンストラクタ
		protected PurcFrcstReg_Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
			down0 = mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR.create();

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
			invoke((MSBDB_PurcFrcstRegBatch)MSBDB_PurcFrcstRegBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcFrcstReg_Ins02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR createPurcFrcstReg_Ins02_CndR(){
			return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
		}

		/**
		 * PurcFrcstReg_Ins02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR createPurcFrcstReg_Ins02_RsltR(){
			return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>except_prcd_ord_flg</td></tr>
		 * 	<tr><td><br></td><td>except_opn_ord_flg</td></tr>
		 * 	<tr><td><br></td><td>except_sav_ord_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_cnt</td></tr>
		 * 	<tr><td><br></td><td>success_cnt</td></tr>
		 * 	<tr><td><br></td><td>error_cnt</td></tr>
		 * 	<tr><td><br></td><td>skip_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDB_PurcFrcstRegBatch)MSBDB_PurcFrcstRegBatch_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcstReg_Del01オペレーション.<p>
	 *
	 * 購買内示情報を削除する。<br>
	 */
	abstract public class PurcFrcstReg_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcstReg_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected PurcFrcstReg_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();

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
			invoke((MSBDB_PurcFrcstRegBatch)MSBDB_PurcFrcstRegBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PurcFrcstReg_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR createPurcFrcstReg_Del01_CndR(){
			return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDB_PurcFrcstRegBatch)MSBDB_PurcFrcstRegBatch_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcstReg_Del02オペレーション.<p>
	 *
	 * 発注先単位で購買内示情報の削除処理を行う。<br>
	 */
	abstract public class PurcFrcstReg_Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcstReg_Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR down0;
		
		
		// コンストラクタ
		protected PurcFrcstReg_Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
			down0 = mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR.create();

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
			invoke((MSBDB_PurcFrcstRegBatch)MSBDB_PurcFrcstRegBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcFrcstReg_Del02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR createPurcFrcstReg_Del02_CndR(){
			return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR.create();
		}

		/**
		 * PurcFrcstReg_Del02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR createPurcFrcstReg_Del02_RsltR(){
			return mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_cnt</td></tr>
		 * 	<tr><td><br></td><td>success_cnt</td></tr>
		 * 	<tr><td><br></td><td>error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR
		 */
		public mcframe.serverMSBD.MSBDB0010.PurcFrcstReg_Ins02_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDB_PurcFrcstRegBatch)MSBDB_PurcFrcstRegBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}