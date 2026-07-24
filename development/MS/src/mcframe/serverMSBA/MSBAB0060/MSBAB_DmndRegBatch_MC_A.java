package mcframe.serverMSBA.MSBAB0060;

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
 * "MSBAB_DmndRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBAB_DmndRegBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBAB0060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBAB_DmndRegBatch.DmndReg_Upd01 aDmndReg_Upd01;

	protected void initDmndReg_Upd01() {
		this.info = PDef.MS_MSBAB0060_DmndReg_Upd01_INFO;
		this.aDmndReg_Upd01 = ((MSBAB_DmndRegBatch)this).new DmndReg_Upd01();
	}

	public static MSBAB_DmndRegBatch.DmndReg_Upd01 crtDmndReg_Upd01() {
		MSBAB_DmndRegBatch lgc = new MSBAB_DmndRegBatch();
		lgc.initDmndReg_Upd01();
		return lgc.aDmndReg_Upd01;
	}

	protected void paramDmndReg_Upd01(MCParam p) {
		if (this.aDmndReg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDmndReg_Upd01.up0());
	}

	protected void doDmndReg_Upd01() {
		aDmndReg_Upd01.call();
	};

	/**
	 * DmndReg_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAB0060.DmndReg_Upd01_CndR createDmndReg_Upd01_CndR(){
		return mcframe.serverMSBA.MSBAB0060.DmndReg_Upd01_CndR.create();
	}
	protected MSBAB_DmndRegBatch.DmndReg_Upd02 aDmndReg_Upd02;

	protected void initDmndReg_Upd02() {
		this.info = PDef.MS_MSBAB0060_DmndReg_Upd02_INFO;
		this.aDmndReg_Upd02 = ((MSBAB_DmndRegBatch)this).new DmndReg_Upd02();
	}

	public static MSBAB_DmndRegBatch.DmndReg_Upd02 crtDmndReg_Upd02() {
		MSBAB_DmndRegBatch lgc = new MSBAB_DmndRegBatch();
		lgc.initDmndReg_Upd02();
		return lgc.aDmndReg_Upd02;
	}

	protected void paramDmndReg_Upd02(MCParam p) {
		if (this.aDmndReg_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDmndReg_Upd02.up0());
		p.addDownBlock(aDmndReg_Upd02.down0());
	}

	protected void doDmndReg_Upd02() {
		aDmndReg_Upd02.call();
	};

	/**
	 * DmndReg_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR createDmndReg_Upd02_CndR(){
		return mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR.create();
	}

	/**
	 * DmndReg_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR> createDmndReg_Upd02_CndL(){
		return MCList.create(mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR.class);
	}

	/**
	 * DmndReg_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR createDmndReg_Upd02_RsltR(){
		return mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR.create();
	}

	/**
	 * DmndReg_Upd02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR> createDmndReg_Upd02_RsltL(){
		return MCList.create(mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * DmndReg_Upd01オペレーション.<p>
	 *
	 * 需要情報を登録・削除する<br>
	 */
	abstract public class DmndReg_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DmndReg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBA.MSBAB0060.DmndReg_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected DmndReg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBA.MSBAB0060.DmndReg_Upd01_CndR.create();

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
			invoke((MSBAB_DmndRegBatch)MSBAB_DmndRegBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DmndReg_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAB0060.DmndReg_Upd01_CndR createDmndReg_Upd01_CndR(){
			return mcframe.serverMSBA.MSBAB0060.DmndReg_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dly_dmnd_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>reg_st_dt</td></tr>
		 * 	<tr><td><br></td><td>reg_end_dt</td></tr>
		 * 	<tr><td><br></td><td>date_div_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBA.MSBAB0060.DmndReg_Upd01_CndR
		 */
		public mcframe.serverMSBA.MSBAB0060.DmndReg_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAB_DmndRegBatch)MSBAB_DmndRegBatch_MC_A.this).info;
		}


	}
	/**
	 * DmndReg_Upd02オペレーション.<p>
	 *
	 * 需要情報を登録・削除する(マルチスレッド用)<br>
	 */
	abstract public class DmndReg_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DmndReg_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR> down0;
		
		
		// コンストラクタ
		protected DmndReg_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR.class);

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
			invoke((MSBAB_DmndRegBatch)MSBAB_DmndRegBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DmndReg_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR createDmndReg_Upd02_CndR(){
			return mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR.create();
		}

		/**
		 * DmndReg_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR> createDmndReg_Upd02_CndL(){
			return MCList.create(mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR.class);
		}

		/**
		 * DmndReg_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR createDmndReg_Upd02_RsltR(){
			return mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR.create();
		}

		/**
		 * DmndReg_Upd02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR> createDmndReg_Upd02_RsltL(){
			return MCList.create(mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dly_dmnd_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>reg_st_dt</td></tr>
		 * 	<tr><td><br></td><td>reg_end_dt</td></tr>
		 * 	<tr><td><br></td><td>date_div_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>new_dpt_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_CndR> up0() {
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAB0060.DmndReg_Upd02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAB_DmndRegBatch)MSBAB_DmndRegBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}