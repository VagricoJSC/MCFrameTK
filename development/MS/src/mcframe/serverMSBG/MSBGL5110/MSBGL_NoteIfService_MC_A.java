package mcframe.serverMSBG.MSBGL5110;

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
 * "MSBGL_NoteIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_NoteIfService_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL5110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_NoteIfService.NoteIf_Ins01 aNoteIf_Ins01;

	protected void initNoteIf_Ins01() {
		this.info = PDef.MS_MSBGL5110_NoteIf_Ins01_INFO;
		this.aNoteIf_Ins01 = ((MSBGL_NoteIfService)this).new NoteIf_Ins01();
	}

	public static MSBGL_NoteIfService.NoteIf_Ins01 crtNoteIf_Ins01() {
		MSBGL_NoteIfService lgc = new MSBGL_NoteIfService();
		lgc.initNoteIf_Ins01();
		return lgc.aNoteIf_Ins01;
	}

	protected void paramNoteIf_Ins01(MCParam p) {
		if (this.aNoteIf_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aNoteIf_Ins01.up0());
		p.addDownBlock(aNoteIf_Ins01.down0());
	}

	protected void doNoteIf_Ins01() {
		aNoteIf_Ins01.call();
	};

	/**
	 * NoteIf_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR createNoteIf_Ins01_CndR(){
		return mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR.create();
	}

	/**
	 * NoteIf_Ins01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR> createNoteIf_Ins01_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * NoteIf_Ins01オペレーション.<p>
	 *
	 * 手形管理ＮＯをもとに手形情報ＩＦを作成する<br>
	 */
	abstract public class NoteIf_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "NoteIf_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR> down0;
		
		
		// コンストラクタ
		protected NoteIf_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR.class);

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
			invoke((MSBGL_NoteIfService)MSBGL_NoteIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * NoteIf_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR createNoteIf_Ins01_CndR(){
			return mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR.create();
		}

		/**
		 * NoteIf_Ins01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR> createNoteIf_Ins01_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_NoteIfService)MSBGL_NoteIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}