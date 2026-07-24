package mcframe.serverMSUC.MSUCL0080;

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
 * "MSUCL_SlsUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUCL_SlsUtil_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSUCL0080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSUCL_SlsUtil.SlsUtil_Srch01 aSlsUtil_Srch01;

	protected void initSlsUtil_Srch01() {
		this.info = PDef.MS_MSUCL0080_SlsUtil_Srch01_INFO;
		this.aSlsUtil_Srch01 = ((MSUCL_SlsUtil)this).new SlsUtil_Srch01();
	}

	public static MSUCL_SlsUtil.SlsUtil_Srch01 crtSlsUtil_Srch01() {
		MSUCL_SlsUtil lgc = new MSUCL_SlsUtil();
		lgc.initSlsUtil_Srch01();
		return lgc.aSlsUtil_Srch01;
	}

	protected void paramSlsUtil_Srch01(MCParam p) {
		if (this.aSlsUtil_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUtil_Srch01.up0());
		p.addDownBlock(aSlsUtil_Srch01.down0());
	}

	protected void doSlsUtil_Srch01() {
		aSlsUtil_Srch01.call();
	};

	/**
	 * SlsUtil_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR createSlsUtil_Srch01_CndR(){
		return mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR.create();
	}

	/**
	 * SlsUtil_Srch01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR> createSlsUtil_Srch01_CndL(){
		return MCList.create(mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SlsUtil_Srch01オペレーション.<p>
	 *
	 * 販売状況区分を求める<br>
	 */
	abstract public class SlsUtil_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUtil_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR> down0;
		
		
		// コンストラクタ
		protected SlsUtil_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR.class);

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
			invoke((MSUCL_SlsUtil)MSUCL_SlsUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SlsUtil_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR createSlsUtil_Srch01_CndR(){
			return mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR.create();
		}

		/**
		 * SlsUtil_Srch01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR> createSlsUtil_Srch01_CndL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0080.SlsUtil_Srch01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_SlsUtil)MSUCL_SlsUtil_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}