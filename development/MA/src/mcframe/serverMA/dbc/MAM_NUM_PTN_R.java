package mcframe.serverMA.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "発番パタンマスタ // Numbering pattern master"DBコンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>日本語</th>
 *  	<th>フルネーム</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>num_biz_typ</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発番業務区分</td>
 *  	<td>Numbering operation type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>num_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発番パタンＣＤ</td>
 *  	<td>Numbering pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発番パタン名</td>
 *  	<td>Numbering pattern name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_num_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発番パタン名（ベース）</td>
 *  	<td>Numbering pattern name(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_typ1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分１</td>
 *  	<td>Element type 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_typ2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分２</td>
 *  	<td>Element type 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_typ3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分３</td>
 *  	<td>Element type 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_typ4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分４</td>
 *  	<td>Element type 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_typ5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分５</td>
 *  	<td>Element type 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_typ6</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分６</td>
 *  	<td>Element type 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_typ7</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分７</td>
 *  	<td>Element type 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_typ8</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分８</td>
 *  	<td>Element type 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_typ9</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分９</td>
 *  	<td>Element type 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_typ10</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素区分１０</td>
 *  	<td>Element type 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_dgt1</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素１桁数</td>
 *  	<td>Element 1 digit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_dgt2</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素２桁数</td>
 *  	<td>Element 2 digit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_dgt3</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素３桁数</td>
 *  	<td>Element 3 digit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_dgt4</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素４桁数</td>
 *  	<td>Element 4 digit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_dgt5</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素５桁数</td>
 *  	<td>Element 5 digit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_dgt6</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素６桁数</td>
 *  	<td>Element 6 digit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_dgt7</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素７桁数</td>
 *  	<td>Element 7 digit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_dgt8</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素８桁数</td>
 *  	<td>Element 8 digit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>elm_dgt9</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素９桁数</td>
 *  	<td>Element 9 digit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>elm_dgt10</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>要素１０桁数</td>
 *  	<td>Element 10 digit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix1</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値１</td>
 *  	<td>Fixed value 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fix2</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値２</td>
 *  	<td>Fixed value 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix3</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値３</td>
 *  	<td>Fixed value 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fix4</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値４</td>
 *  	<td>Fixed value 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix5</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値５</td>
 *  	<td>Fixed value 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fix6</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値６</td>
 *  	<td>Fixed value 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix7</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値７</td>
 *  	<td>Fixed value 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fix8</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値８</td>
 *  	<td>Fixed value 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix9</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値９</td>
 *  	<td>Fixed value 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fix10</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定値１０</td>
 *  	<td>Fixed value 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>undisp_flg1</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ１</td>
 *  	<td>Hide flg. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>undisp_flg2</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ２</td>
 *  	<td>Hide flg. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>undisp_flg3</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ３</td>
 *  	<td>Hide flg. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>undisp_flg4</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ４</td>
 *  	<td>Hide flg. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>undisp_flg5</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ５</td>
 *  	<td>Hide flg. 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>undisp_flg6</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ６</td>
 *  	<td>Hide flg. 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>undisp_flg7</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ７</td>
 *  	<td>Hide flg. 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>undisp_flg8</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ８</td>
 *  	<td>Hide flg. 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>undisp_flg9</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ９</td>
 *  	<td>Hide flg. 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>undisp_flg10</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ１０</td>
 *  	<td>Hide flg. 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_pad_str1</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字１</td>
 *  	<td>Digit fill character 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_pad_str2</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字２</td>
 *  	<td>Digit fill character 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_pad_str3</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字３</td>
 *  	<td>Digit fill character 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_pad_str4</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字４</td>
 *  	<td>Digit fill character 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_pad_str5</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字５</td>
 *  	<td>Digit fill character 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_pad_str6</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字６</td>
 *  	<td>Digit fill character 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_pad_str7</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字７</td>
 *  	<td>Digit fill character 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_pad_str8</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字８</td>
 *  	<td>Digit fill character 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_pad_str9</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字９</td>
 *  	<td>Digit fill character 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_pad_str10</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>桁埋め文字１０</td>
 *  	<td>Digit fill character 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>key_dgt</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>キー項目桁数</td>
 *  	<td>Key column number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_seq_typ</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>シーケンス区分</td>
 *  	<td>Sequence type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザＩＤ</td>
 *  	<td>Entry user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザ名</td>
 *  	<td>Entry user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録日時</td>
 *  	<td>Entry date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録機能ＩＤ</td>
 *  	<td>Entry function ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新カウンタ</td>
 *  	<td>Update counter</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザＩＤ</td>
 *  	<td>Update user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザ名</td>
 *  	<td>Update user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日時</td>
 *  	<td>Update date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新機能ＩＤ</td>
 *  	<td>Update function ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_srv_req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新リクエストＮＯ</td>
 *  	<td>Update request No.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_NUM_PTN_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_NUM_PTN";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 発番業務区分. Numbering operation type.<p>
	 *
	 */
	public static final String $num_biz_typ = "num_biz_typ";
	private static final MCPermColumnInfo _num_biz_typ = createColumnInfo("num_biz_typ");
	public final MCStringPermColumn num_biz_typ = createStringColumn(_num_biz_typ);
	
	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public static final String $num_ptn_cd = "num_ptn_cd";
	private static final MCPermColumnInfo _num_ptn_cd = createColumnInfo("num_ptn_cd");
	public final MCStringPermColumn num_ptn_cd = createStringColumn(_num_ptn_cd);
	
	/**
	 * 発番パタン名. Numbering pattern name.<p>
	 *
	 */
	public static final String $num_ptn_nm = "num_ptn_nm";
	private static final MCPermColumnInfo _num_ptn_nm = createColumnInfo("num_ptn_nm");
	public final MCStringPermColumn num_ptn_nm = createStringColumn(_num_ptn_nm);
	
	/**
	 * 発番パタン名（ベース）. Numbering pattern name(Base).<p>
	 *
	 */
	public static final String $base_num_ptn_nm = "base_num_ptn_nm";
	private static final MCPermColumnInfo _base_num_ptn_nm = createColumnInfo("base_num_ptn_nm");
	public final MCStringPermColumn base_num_ptn_nm = createStringColumn(_base_num_ptn_nm);
	
	/**
	 * 要素区分１. Element type 1.<p>
	 *
	 */
	public static final String $elm_typ1 = "elm_typ1";
	private static final MCPermColumnInfo _elm_typ1 = createColumnInfo("elm_typ1");
	public final MCStringPermColumn elm_typ1 = createStringColumn(_elm_typ1);
	
	/**
	 * 要素区分２. Element type 2.<p>
	 *
	 */
	public static final String $elm_typ2 = "elm_typ2";
	private static final MCPermColumnInfo _elm_typ2 = createColumnInfo("elm_typ2");
	public final MCStringPermColumn elm_typ2 = createStringColumn(_elm_typ2);
	
	/**
	 * 要素区分３. Element type 3.<p>
	 *
	 */
	public static final String $elm_typ3 = "elm_typ3";
	private static final MCPermColumnInfo _elm_typ3 = createColumnInfo("elm_typ3");
	public final MCStringPermColumn elm_typ3 = createStringColumn(_elm_typ3);
	
	/**
	 * 要素区分４. Element type 4.<p>
	 *
	 */
	public static final String $elm_typ4 = "elm_typ4";
	private static final MCPermColumnInfo _elm_typ4 = createColumnInfo("elm_typ4");
	public final MCStringPermColumn elm_typ4 = createStringColumn(_elm_typ4);
	
	/**
	 * 要素区分５. Element type 5.<p>
	 *
	 */
	public static final String $elm_typ5 = "elm_typ5";
	private static final MCPermColumnInfo _elm_typ5 = createColumnInfo("elm_typ5");
	public final MCStringPermColumn elm_typ5 = createStringColumn(_elm_typ5);
	
	/**
	 * 要素区分６. Element type 6.<p>
	 *
	 */
	public static final String $elm_typ6 = "elm_typ6";
	private static final MCPermColumnInfo _elm_typ6 = createColumnInfo("elm_typ6");
	public final MCStringPermColumn elm_typ6 = createStringColumn(_elm_typ6);
	
	/**
	 * 要素区分７. Element type 7.<p>
	 *
	 */
	public static final String $elm_typ7 = "elm_typ7";
	private static final MCPermColumnInfo _elm_typ7 = createColumnInfo("elm_typ7");
	public final MCStringPermColumn elm_typ7 = createStringColumn(_elm_typ7);
	
	/**
	 * 要素区分８. Element type 8.<p>
	 *
	 */
	public static final String $elm_typ8 = "elm_typ8";
	private static final MCPermColumnInfo _elm_typ8 = createColumnInfo("elm_typ8");
	public final MCStringPermColumn elm_typ8 = createStringColumn(_elm_typ8);
	
	/**
	 * 要素区分９. Element type 9.<p>
	 *
	 */
	public static final String $elm_typ9 = "elm_typ9";
	private static final MCPermColumnInfo _elm_typ9 = createColumnInfo("elm_typ9");
	public final MCStringPermColumn elm_typ9 = createStringColumn(_elm_typ9);
	
	/**
	 * 要素区分１０. Element type 10.<p>
	 *
	 */
	public static final String $elm_typ10 = "elm_typ10";
	private static final MCPermColumnInfo _elm_typ10 = createColumnInfo("elm_typ10");
	public final MCStringPermColumn elm_typ10 = createStringColumn(_elm_typ10);
	
	/**
	 * 要素１桁数. Element 1 digit.<p>
	 *
	 */
	public static final String $elm_dgt1 = "elm_dgt1";
	private static final MCPermColumnInfo _elm_dgt1 = createColumnInfo("elm_dgt1");
	public final MCNumberPermColumn elm_dgt1 = createNumberColumn(_elm_dgt1);
	
	/**
	 * 要素２桁数. Element 2 digit.<p>
	 *
	 */
	public static final String $elm_dgt2 = "elm_dgt2";
	private static final MCPermColumnInfo _elm_dgt2 = createColumnInfo("elm_dgt2");
	public final MCNumberPermColumn elm_dgt2 = createNumberColumn(_elm_dgt2);
	
	/**
	 * 要素３桁数. Element 3 digit.<p>
	 *
	 */
	public static final String $elm_dgt3 = "elm_dgt3";
	private static final MCPermColumnInfo _elm_dgt3 = createColumnInfo("elm_dgt3");
	public final MCNumberPermColumn elm_dgt3 = createNumberColumn(_elm_dgt3);
	
	/**
	 * 要素４桁数. Element 4 digit.<p>
	 *
	 */
	public static final String $elm_dgt4 = "elm_dgt4";
	private static final MCPermColumnInfo _elm_dgt4 = createColumnInfo("elm_dgt4");
	public final MCNumberPermColumn elm_dgt4 = createNumberColumn(_elm_dgt4);
	
	/**
	 * 要素５桁数. Element 5 digit.<p>
	 *
	 */
	public static final String $elm_dgt5 = "elm_dgt5";
	private static final MCPermColumnInfo _elm_dgt5 = createColumnInfo("elm_dgt5");
	public final MCNumberPermColumn elm_dgt5 = createNumberColumn(_elm_dgt5);
	
	/**
	 * 要素６桁数. Element 6 digit.<p>
	 *
	 */
	public static final String $elm_dgt6 = "elm_dgt6";
	private static final MCPermColumnInfo _elm_dgt6 = createColumnInfo("elm_dgt6");
	public final MCNumberPermColumn elm_dgt6 = createNumberColumn(_elm_dgt6);
	
	/**
	 * 要素７桁数. Element 7 digit.<p>
	 *
	 */
	public static final String $elm_dgt7 = "elm_dgt7";
	private static final MCPermColumnInfo _elm_dgt7 = createColumnInfo("elm_dgt7");
	public final MCNumberPermColumn elm_dgt7 = createNumberColumn(_elm_dgt7);
	
	/**
	 * 要素８桁数. Element 8 digit.<p>
	 *
	 */
	public static final String $elm_dgt8 = "elm_dgt8";
	private static final MCPermColumnInfo _elm_dgt8 = createColumnInfo("elm_dgt8");
	public final MCNumberPermColumn elm_dgt8 = createNumberColumn(_elm_dgt8);
	
	/**
	 * 要素９桁数. Element 9 digit.<p>
	 *
	 */
	public static final String $elm_dgt9 = "elm_dgt9";
	private static final MCPermColumnInfo _elm_dgt9 = createColumnInfo("elm_dgt9");
	public final MCNumberPermColumn elm_dgt9 = createNumberColumn(_elm_dgt9);
	
	/**
	 * 要素１０桁数. Element 10 digit.<p>
	 *
	 */
	public static final String $elm_dgt10 = "elm_dgt10";
	private static final MCPermColumnInfo _elm_dgt10 = createColumnInfo("elm_dgt10");
	public final MCNumberPermColumn elm_dgt10 = createNumberColumn(_elm_dgt10);
	
	/**
	 * 固定値１. Fixed value 1.<p>
	 *
	 */
	public static final String $fix1 = "fix1";
	private static final MCPermColumnInfo _fix1 = createColumnInfo("fix1");
	public final MCStringPermColumn fix1 = createStringColumn(_fix1);
	
	/**
	 * 固定値２. Fixed value 2.<p>
	 *
	 */
	public static final String $fix2 = "fix2";
	private static final MCPermColumnInfo _fix2 = createColumnInfo("fix2");
	public final MCStringPermColumn fix2 = createStringColumn(_fix2);
	
	/**
	 * 固定値３. Fixed value 3.<p>
	 *
	 */
	public static final String $fix3 = "fix3";
	private static final MCPermColumnInfo _fix3 = createColumnInfo("fix3");
	public final MCStringPermColumn fix3 = createStringColumn(_fix3);
	
	/**
	 * 固定値４. Fixed value 4.<p>
	 *
	 */
	public static final String $fix4 = "fix4";
	private static final MCPermColumnInfo _fix4 = createColumnInfo("fix4");
	public final MCStringPermColumn fix4 = createStringColumn(_fix4);
	
	/**
	 * 固定値５. Fixed value 5.<p>
	 *
	 */
	public static final String $fix5 = "fix5";
	private static final MCPermColumnInfo _fix5 = createColumnInfo("fix5");
	public final MCStringPermColumn fix5 = createStringColumn(_fix5);
	
	/**
	 * 固定値６. Fixed value 6.<p>
	 *
	 */
	public static final String $fix6 = "fix6";
	private static final MCPermColumnInfo _fix6 = createColumnInfo("fix6");
	public final MCStringPermColumn fix6 = createStringColumn(_fix6);
	
	/**
	 * 固定値７. Fixed value 7.<p>
	 *
	 */
	public static final String $fix7 = "fix7";
	private static final MCPermColumnInfo _fix7 = createColumnInfo("fix7");
	public final MCStringPermColumn fix7 = createStringColumn(_fix7);
	
	/**
	 * 固定値８. Fixed value 8.<p>
	 *
	 */
	public static final String $fix8 = "fix8";
	private static final MCPermColumnInfo _fix8 = createColumnInfo("fix8");
	public final MCStringPermColumn fix8 = createStringColumn(_fix8);
	
	/**
	 * 固定値９. Fixed value 9.<p>
	 *
	 */
	public static final String $fix9 = "fix9";
	private static final MCPermColumnInfo _fix9 = createColumnInfo("fix9");
	public final MCStringPermColumn fix9 = createStringColumn(_fix9);
	
	/**
	 * 固定値１０. Fixed value 10.<p>
	 *
	 */
	public static final String $fix10 = "fix10";
	private static final MCPermColumnInfo _fix10 = createColumnInfo("fix10");
	public final MCStringPermColumn fix10 = createStringColumn(_fix10);
	
	/**
	 * 非表示ＦＬＧ１. Hide flg. 1.<p>
	 *
	 */
	public static final String $undisp_flg1 = "undisp_flg1";
	private static final MCPermColumnInfo _undisp_flg1 = createColumnInfo("undisp_flg1");
	public final MCBooleanPermColumn undisp_flg1 = createBooleanColumn(_undisp_flg1);
	
	/**
	 * 非表示ＦＬＧ２. Hide flg. 2.<p>
	 *
	 */
	public static final String $undisp_flg2 = "undisp_flg2";
	private static final MCPermColumnInfo _undisp_flg2 = createColumnInfo("undisp_flg2");
	public final MCBooleanPermColumn undisp_flg2 = createBooleanColumn(_undisp_flg2);
	
	/**
	 * 非表示ＦＬＧ３. Hide flg. 3.<p>
	 *
	 */
	public static final String $undisp_flg3 = "undisp_flg3";
	private static final MCPermColumnInfo _undisp_flg3 = createColumnInfo("undisp_flg3");
	public final MCBooleanPermColumn undisp_flg3 = createBooleanColumn(_undisp_flg3);
	
	/**
	 * 非表示ＦＬＧ４. Hide flg. 4.<p>
	 *
	 */
	public static final String $undisp_flg4 = "undisp_flg4";
	private static final MCPermColumnInfo _undisp_flg4 = createColumnInfo("undisp_flg4");
	public final MCBooleanPermColumn undisp_flg4 = createBooleanColumn(_undisp_flg4);
	
	/**
	 * 非表示ＦＬＧ５. Hide flg. 5.<p>
	 *
	 */
	public static final String $undisp_flg5 = "undisp_flg5";
	private static final MCPermColumnInfo _undisp_flg5 = createColumnInfo("undisp_flg5");
	public final MCBooleanPermColumn undisp_flg5 = createBooleanColumn(_undisp_flg5);
	
	/**
	 * 非表示ＦＬＧ６. Hide flg. 6.<p>
	 *
	 */
	public static final String $undisp_flg6 = "undisp_flg6";
	private static final MCPermColumnInfo _undisp_flg6 = createColumnInfo("undisp_flg6");
	public final MCBooleanPermColumn undisp_flg6 = createBooleanColumn(_undisp_flg6);
	
	/**
	 * 非表示ＦＬＧ７. Hide flg. 7.<p>
	 *
	 */
	public static final String $undisp_flg7 = "undisp_flg7";
	private static final MCPermColumnInfo _undisp_flg7 = createColumnInfo("undisp_flg7");
	public final MCBooleanPermColumn undisp_flg7 = createBooleanColumn(_undisp_flg7);
	
	/**
	 * 非表示ＦＬＧ８. Hide flg. 8.<p>
	 *
	 */
	public static final String $undisp_flg8 = "undisp_flg8";
	private static final MCPermColumnInfo _undisp_flg8 = createColumnInfo("undisp_flg8");
	public final MCBooleanPermColumn undisp_flg8 = createBooleanColumn(_undisp_flg8);
	
	/**
	 * 非表示ＦＬＧ９. Hide flg. 9.<p>
	 *
	 */
	public static final String $undisp_flg9 = "undisp_flg9";
	private static final MCPermColumnInfo _undisp_flg9 = createColumnInfo("undisp_flg9");
	public final MCBooleanPermColumn undisp_flg9 = createBooleanColumn(_undisp_flg9);
	
	/**
	 * 非表示ＦＬＧ１０. Hide flg. 10.<p>
	 *
	 */
	public static final String $undisp_flg10 = "undisp_flg10";
	private static final MCPermColumnInfo _undisp_flg10 = createColumnInfo("undisp_flg10");
	public final MCBooleanPermColumn undisp_flg10 = createBooleanColumn(_undisp_flg10);
	
	/**
	 * 桁埋め文字１. Digit fill character 1.<p>
	 *
	 */
	public static final String $num_pad_str1 = "num_pad_str1";
	private static final MCPermColumnInfo _num_pad_str1 = createColumnInfo("num_pad_str1");
	public final MCStringPermColumn num_pad_str1 = createStringColumn(_num_pad_str1);
	
	/**
	 * 桁埋め文字２. Digit fill character 2.<p>
	 *
	 */
	public static final String $num_pad_str2 = "num_pad_str2";
	private static final MCPermColumnInfo _num_pad_str2 = createColumnInfo("num_pad_str2");
	public final MCStringPermColumn num_pad_str2 = createStringColumn(_num_pad_str2);
	
	/**
	 * 桁埋め文字３. Digit fill character 3.<p>
	 *
	 */
	public static final String $num_pad_str3 = "num_pad_str3";
	private static final MCPermColumnInfo _num_pad_str3 = createColumnInfo("num_pad_str3");
	public final MCStringPermColumn num_pad_str3 = createStringColumn(_num_pad_str3);
	
	/**
	 * 桁埋め文字４. Digit fill character 4.<p>
	 *
	 */
	public static final String $num_pad_str4 = "num_pad_str4";
	private static final MCPermColumnInfo _num_pad_str4 = createColumnInfo("num_pad_str4");
	public final MCStringPermColumn num_pad_str4 = createStringColumn(_num_pad_str4);
	
	/**
	 * 桁埋め文字５. Digit fill character 5.<p>
	 *
	 */
	public static final String $num_pad_str5 = "num_pad_str5";
	private static final MCPermColumnInfo _num_pad_str5 = createColumnInfo("num_pad_str5");
	public final MCStringPermColumn num_pad_str5 = createStringColumn(_num_pad_str5);
	
	/**
	 * 桁埋め文字６. Digit fill character 6.<p>
	 *
	 */
	public static final String $num_pad_str6 = "num_pad_str6";
	private static final MCPermColumnInfo _num_pad_str6 = createColumnInfo("num_pad_str6");
	public final MCStringPermColumn num_pad_str6 = createStringColumn(_num_pad_str6);
	
	/**
	 * 桁埋め文字７. Digit fill character 7.<p>
	 *
	 */
	public static final String $num_pad_str7 = "num_pad_str7";
	private static final MCPermColumnInfo _num_pad_str7 = createColumnInfo("num_pad_str7");
	public final MCStringPermColumn num_pad_str7 = createStringColumn(_num_pad_str7);
	
	/**
	 * 桁埋め文字８. Digit fill character 8.<p>
	 *
	 */
	public static final String $num_pad_str8 = "num_pad_str8";
	private static final MCPermColumnInfo _num_pad_str8 = createColumnInfo("num_pad_str8");
	public final MCStringPermColumn num_pad_str8 = createStringColumn(_num_pad_str8);
	
	/**
	 * 桁埋め文字９. Digit fill character 9.<p>
	 *
	 */
	public static final String $num_pad_str9 = "num_pad_str9";
	private static final MCPermColumnInfo _num_pad_str9 = createColumnInfo("num_pad_str9");
	public final MCStringPermColumn num_pad_str9 = createStringColumn(_num_pad_str9);
	
	/**
	 * 桁埋め文字１０. Digit fill character 10.<p>
	 *
	 */
	public static final String $num_pad_str10 = "num_pad_str10";
	private static final MCPermColumnInfo _num_pad_str10 = createColumnInfo("num_pad_str10");
	public final MCStringPermColumn num_pad_str10 = createStringColumn(_num_pad_str10);
	
	/**
	 * キー項目桁数. Key column number.<p>
	 *
	 */
	public static final String $key_dgt = "key_dgt";
	private static final MCPermColumnInfo _key_dgt = createColumnInfo("key_dgt");
	public final MCNumberPermColumn key_dgt = createNumberColumn(_key_dgt);
	
	/**
	 * シーケンス区分. Sequence type.<p>
	 *
	 */
	public static final String $def_seq_typ = "def_seq_typ";
	private static final MCPermColumnInfo _def_seq_typ = createColumnInfo("def_seq_typ");
	public final MCStringPermColumn def_seq_typ = createStringColumn(_def_seq_typ);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	private static final MCPermColumnInfo _del_flg = createColumnInfo("del_flg");
	public final MCBooleanPermColumn del_flg = createBooleanColumn(_del_flg);
	
	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	private static final MCPermColumnInfo _del_usr_id = createColumnInfo("del_usr_id");
	public final MCStringPermColumn del_usr_id = createStringColumn(_del_usr_id);
	
	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	private static final MCPermColumnInfo _del_usr_nm = createColumnInfo("del_usr_nm");
	public final MCStringPermColumn del_usr_nm = createStringColumn(_del_usr_nm);
	
	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	private static final MCPermColumnInfo _del_ts = createColumnInfo("del_ts");
	public final MCTimestampPermColumn del_ts = createTimestampColumn(_del_ts);
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	private static final MCPermColumnInfo _ins_usr_id = createColumnInfo("ins_usr_id");
	public final MCStringPermColumn ins_usr_id = createStringColumn(_ins_usr_id);
	
	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	private static final MCPermColumnInfo _ins_usr_nm = createColumnInfo("ins_usr_nm");
	public final MCStringPermColumn ins_usr_nm = createStringColumn(_ins_usr_nm);
	
	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	private static final MCPermColumnInfo _ins_ts = createColumnInfo("ins_ts");
	public final MCTimestampPermColumn ins_ts = createTimestampColumn(_ins_ts);
	
	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	private static final MCPermColumnInfo _ins_func_id = createColumnInfo("ins_func_id");
	public final MCStringPermColumn ins_func_id = createStringColumn(_ins_func_id);
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	private static final MCPermColumnInfo _upd_cntr = createColumnInfo("upd_cntr");
	public final MCNumberPermColumn upd_cntr = createNumberColumn(_upd_cntr);
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	private static final MCPermColumnInfo _upd_usr_id = createColumnInfo("upd_usr_id");
	public final MCStringPermColumn upd_usr_id = createStringColumn(_upd_usr_id);
	
	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	private static final MCPermColumnInfo _upd_usr_nm = createColumnInfo("upd_usr_nm");
	public final MCStringPermColumn upd_usr_nm = createStringColumn(_upd_usr_nm);
	
	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	private static final MCPermColumnInfo _upd_ts = createColumnInfo("upd_ts");
	public final MCTimestampPermColumn upd_ts = createTimestampColumn(_upd_ts);
	
	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	private static final MCPermColumnInfo _upd_func_id = createColumnInfo("upd_func_id");
	public final MCStringPermColumn upd_func_id = createStringColumn(_upd_func_id);
	
	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	private static final MCPermColumnInfo _upd_srv_req_no = createColumnInfo("upd_srv_req_no");
	public final MCStringPermColumn upd_srv_req_no = createStringColumn(_upd_srv_req_no);
	
	public static final MCMeta num_biz_typ_META = createCommonMeta($num_biz_typ, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP);
	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta num_ptn_nm_META = createCommonMeta($num_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta base_num_ptn_nm_META = createCommonMeta($base_num_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta elm_typ1_META = createCommonMeta($elm_typ1, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ2_META = createCommonMeta($elm_typ2, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ3_META = createCommonMeta($elm_typ3, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ4_META = createCommonMeta($elm_typ4, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ5_META = createCommonMeta($elm_typ5, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ6_META = createCommonMeta($elm_typ6, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ7_META = createCommonMeta($elm_typ7, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ8_META = createCommonMeta($elm_typ8, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ9_META = createCommonMeta($elm_typ9, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ10_META = createCommonMeta($elm_typ10, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_dgt1_META = createCommonMeta($elm_dgt1, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_dgt2_META = createCommonMeta($elm_dgt2, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_dgt3_META = createCommonMeta($elm_dgt3, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_dgt4_META = createCommonMeta($elm_dgt4, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_dgt5_META = createCommonMeta($elm_dgt5, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_dgt6_META = createCommonMeta($elm_dgt6, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_dgt7_META = createCommonMeta($elm_dgt7, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_dgt8_META = createCommonMeta($elm_dgt8, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_dgt9_META = createCommonMeta($elm_dgt9, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_dgt10_META = createCommonMeta($elm_dgt10, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix1_META = createCommonMeta($fix1, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta fix2_META = createCommonMeta($fix2, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta fix3_META = createCommonMeta($fix3, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta fix4_META = createCommonMeta($fix4, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta fix5_META = createCommonMeta($fix5, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta fix6_META = createCommonMeta($fix6, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta fix7_META = createCommonMeta($fix7, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta fix8_META = createCommonMeta($fix8, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta fix9_META = createCommonMeta($fix9, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta fix10_META = createCommonMeta($fix10, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg1_META = createCommonMeta($undisp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta undisp_flg2_META = createCommonMeta($undisp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta undisp_flg3_META = createCommonMeta($undisp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta undisp_flg4_META = createCommonMeta($undisp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta undisp_flg5_META = createCommonMeta($undisp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta undisp_flg6_META = createCommonMeta($undisp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta undisp_flg7_META = createCommonMeta($undisp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta undisp_flg8_META = createCommonMeta($undisp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta undisp_flg9_META = createCommonMeta($undisp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta undisp_flg10_META = createCommonMeta($undisp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str1_META = createCommonMeta($num_pad_str1, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta num_pad_str2_META = createCommonMeta($num_pad_str2, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta num_pad_str3_META = createCommonMeta($num_pad_str3, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta num_pad_str4_META = createCommonMeta($num_pad_str4, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta num_pad_str5_META = createCommonMeta($num_pad_str5, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta num_pad_str6_META = createCommonMeta($num_pad_str6, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta num_pad_str7_META = createCommonMeta($num_pad_str7, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta num_pad_str8_META = createCommonMeta($num_pad_str8, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta num_pad_str9_META = createCommonMeta($num_pad_str9, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta num_pad_str10_META = createCommonMeta($num_pad_str10, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta key_dgt_META = createCommonMeta($key_dgt, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta def_seq_typ_META = createCommonMeta($def_seq_typ, mcframe.commonMA.meta.MA_META.SEQ_TYP);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $LCL = "LCL";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_NUM_PTN",
				$LCL,
				new String[][]{
						{"num_biz_typ", "num_biz_typ"},
						{"num_ptn_cd", "num_ptn_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_NUM_PTN_R.create("LCL");
				},
				(alias) -> {
					MAM_NUM_PTN_R own = MAM_NUM_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_NUM_PTN_R ref = mcframe.serverMA.dbc.MAM_NUM_PTN_R.create("LCL");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.num_biz_typ.eq(ref.num_biz_typ));
					cond = cond.and(own.num_ptn_cd.eq(ref.num_ptn_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_NUM_PTN_R> constMetas = new ConstMetaList<MAM_NUM_PTN_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			num_biz_typ_META,
			num_ptn_cd_META,
			num_ptn_nm_META,
			base_num_ptn_nm_META,
			elm_typ1_META,
			elm_typ2_META,
			elm_typ3_META,
			elm_typ4_META,
			elm_typ5_META,
			elm_typ6_META,
			elm_typ7_META,
			elm_typ8_META,
			elm_typ9_META,
			elm_typ10_META,
			elm_dgt1_META,
			elm_dgt2_META,
			elm_dgt3_META,
			elm_dgt4_META,
			elm_dgt5_META,
			elm_dgt6_META,
			elm_dgt7_META,
			elm_dgt8_META,
			elm_dgt9_META,
			elm_dgt10_META,
			fix1_META,
			fix2_META,
			fix3_META,
			fix4_META,
			fix5_META,
			fix6_META,
			fix7_META,
			fix8_META,
			fix9_META,
			fix10_META,
			undisp_flg1_META,
			undisp_flg2_META,
			undisp_flg3_META,
			undisp_flg4_META,
			undisp_flg5_META,
			undisp_flg6_META,
			undisp_flg7_META,
			undisp_flg8_META,
			undisp_flg9_META,
			undisp_flg10_META,
			num_pad_str1_META,
			num_pad_str2_META,
			num_pad_str3_META,
			num_pad_str4_META,
			num_pad_str5_META,
			num_pad_str6_META,
			num_pad_str7_META,
			num_pad_str8_META,
			num_pad_str9_META,
			num_pad_str10_META,
			key_dgt_META,
			def_seq_typ_META,
			memo1_META,
			memo2_META,
			memo3_META,
			del_flg_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);
	

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * コンストラクタです。
	 */
	protected MAM_NUM_PTN_R(ConstMetaList<? extends MAM_NUM_PTN_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_NUM_PTN_R(ConstMetaList<? extends MAM_NUM_PTN_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_biz_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_biz_typ,
				"num_biz_typ",
				num_biz_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_ptn_cd,
				"num_ptn_cd",
				num_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_ptn_nm,
				"num_ptn_nm",
				num_ptn_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$base_num_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$base_num_ptn_nm,
				"base_num_ptn_nm",
				base_num_ptn_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ1,
				"elm_typ1",
				elm_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ2,
				"elm_typ2",
				elm_typ2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ3,
				"elm_typ3",
				elm_typ3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ4,
				"elm_typ4",
				elm_typ4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ5,
				"elm_typ5",
				elm_typ5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ6,
				"elm_typ6",
				elm_typ6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ7,
				"elm_typ7",
				elm_typ7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ8,
				"elm_typ8",
				elm_typ8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ9,
				"elm_typ9",
				elm_typ9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_typ10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$elm_typ10,
				"elm_typ10",
				elm_typ10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt1,
				"elm_dgt1",
				elm_dgt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt2,
				"elm_dgt2",
				elm_dgt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt3,
				"elm_dgt3",
				elm_dgt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt4,
				"elm_dgt4",
				elm_dgt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt5,
				"elm_dgt5",
				elm_dgt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt6,
				"elm_dgt6",
				elm_dgt6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt7,
				"elm_dgt7",
				elm_dgt7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt8,
				"elm_dgt8",
				elm_dgt8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt9,
				"elm_dgt9",
				elm_dgt9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$elm_dgt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$elm_dgt10,
				"elm_dgt10",
				elm_dgt10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix1,
				"fix1",
				fix1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix2,
				"fix2",
				fix2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix3,
				"fix3",
				fix3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix4,
				"fix4",
				fix4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix5,
				"fix5",
				fix5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix6,
				"fix6",
				fix6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix7,
				"fix7",
				fix7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix8,
				"fix8",
				fix8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix9,
				"fix9",
				fix9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$fix10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$fix10,
				"fix10",
				fix10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg1,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg1,
				"undisp_flg1",
				undisp_flg1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg2,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg2,
				"undisp_flg2",
				undisp_flg2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg3,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg3,
				"undisp_flg3",
				undisp_flg3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg4,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg4,
				"undisp_flg4",
				undisp_flg4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg5,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg5,
				"undisp_flg5",
				undisp_flg5,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg6,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg6,
				"undisp_flg6",
				undisp_flg6,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg7,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg7,
				"undisp_flg7",
				undisp_flg7,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg8,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg8,
				"undisp_flg8",
				undisp_flg8,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg9,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg9,
				"undisp_flg9",
				undisp_flg9,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$undisp_flg10,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$undisp_flg10,
				"undisp_flg10",
				undisp_flg10,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str1,
				"num_pad_str1",
				num_pad_str1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str2,
				"num_pad_str2",
				num_pad_str2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str3,
				"num_pad_str3",
				num_pad_str3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str4,
				"num_pad_str4",
				num_pad_str4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str5,
				"num_pad_str5",
				num_pad_str5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str6,
				"num_pad_str6",
				num_pad_str6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str7,
				"num_pad_str7",
				num_pad_str7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str8,
				"num_pad_str8",
				num_pad_str8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str9,
				"num_pad_str9",
				num_pad_str9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$num_pad_str10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$num_pad_str10,
				"num_pad_str10",
				num_pad_str10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$key_dgt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$key_dgt,
				"key_dgt",
				key_dgt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$def_seq_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$def_seq_typ,
				"def_seq_typ",
				def_seq_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_NUM_PTN_R.$del_flg,
				"del_flg",
				del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$del_usr_id,
				"del_usr_id",
				del_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$del_usr_nm,
				"del_usr_nm",
				del_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_NUM_PTN_R.$del_ts,
				"del_ts",
				del_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_NUM_PTN_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_NUM_PTN_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_NUM_PTN_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_NUM_PTN_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_NUM_PTN_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_NUM_PTN_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_NUM_PTN_R create(String alias) {
		MAM_NUM_PTN_R row = new MAM_NUM_PTN_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_NUM_PTN_R createByName(T proto) {
		MAM_NUM_PTN_R row = MAM_NUM_PTN_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_NUM_PTN_R clone() {
		return (MAM_NUM_PTN_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_NUM_PTN_R createInstance() {
		return (MAM_NUM_PTN_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_NUM_PTN_R getValues(String... names) {
		return (MAM_NUM_PTN_R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasCocdFilter() {
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasLclFilter() {
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_NUM_PTN_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_NUM_PTN_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_NUM_PTN_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_NUM_PTN_KEY_R.TABLE_NAME);
	 }

	/**
	 * 発番業務区分. Numbering operation type.<p>
	 *
	 */
	public String num_biz_typ() {
		return getConstString(offset + 0, $num_biz_typ);
	}

	/**
	 * 発番業務区分. Numbering operation type.<p>
	 *
	 */
	public void num_biz_typ(String value) {
		setConstString(offset + 0, $num_biz_typ, value);
	}

	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public String num_ptn_cd() {
		return getConstString(offset + 1, $num_ptn_cd);
	}

	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		setConstString(offset + 1, $num_ptn_cd, value);
	}

	/**
	 * 発番パタン名. Numbering pattern name.<p>
	 *
	 */
	public String num_ptn_nm() {
		return getConstString(offset + 2, $num_ptn_nm);
	}

	/**
	 * 発番パタン名. Numbering pattern name.<p>
	 *
	 */
	public void num_ptn_nm(String value) {
		setConstString(offset + 2, $num_ptn_nm, value);
	}

	/**
	 * 発番パタン名（ベース）. Numbering pattern name(Base).<p>
	 *
	 */
	public String base_num_ptn_nm() {
		return getConstString(offset + 3, $base_num_ptn_nm);
	}

	/**
	 * 発番パタン名（ベース）. Numbering pattern name(Base).<p>
	 *
	 */
	public void base_num_ptn_nm(String value) {
		setConstString(offset + 3, $base_num_ptn_nm, value);
	}

	/**
	 * 要素区分１. Element type 1.<p>
	 *
	 */
	public String elm_typ1() {
		return getConstString(offset + 4, $elm_typ1);
	}

	/**
	 * 要素区分１. Element type 1.<p>
	 *
	 */
	public void elm_typ1(String value) {
		setConstString(offset + 4, $elm_typ1, value);
	}

	/**
	 * 要素区分２. Element type 2.<p>
	 *
	 */
	public String elm_typ2() {
		return getConstString(offset + 5, $elm_typ2);
	}

	/**
	 * 要素区分２. Element type 2.<p>
	 *
	 */
	public void elm_typ2(String value) {
		setConstString(offset + 5, $elm_typ2, value);
	}

	/**
	 * 要素区分３. Element type 3.<p>
	 *
	 */
	public String elm_typ3() {
		return getConstString(offset + 6, $elm_typ3);
	}

	/**
	 * 要素区分３. Element type 3.<p>
	 *
	 */
	public void elm_typ3(String value) {
		setConstString(offset + 6, $elm_typ3, value);
	}

	/**
	 * 要素区分４. Element type 4.<p>
	 *
	 */
	public String elm_typ4() {
		return getConstString(offset + 7, $elm_typ4);
	}

	/**
	 * 要素区分４. Element type 4.<p>
	 *
	 */
	public void elm_typ4(String value) {
		setConstString(offset + 7, $elm_typ4, value);
	}

	/**
	 * 要素区分５. Element type 5.<p>
	 *
	 */
	public String elm_typ5() {
		return getConstString(offset + 8, $elm_typ5);
	}

	/**
	 * 要素区分５. Element type 5.<p>
	 *
	 */
	public void elm_typ5(String value) {
		setConstString(offset + 8, $elm_typ5, value);
	}

	/**
	 * 要素区分６. Element type 6.<p>
	 *
	 */
	public String elm_typ6() {
		return getConstString(offset + 9, $elm_typ6);
	}

	/**
	 * 要素区分６. Element type 6.<p>
	 *
	 */
	public void elm_typ6(String value) {
		setConstString(offset + 9, $elm_typ6, value);
	}

	/**
	 * 要素区分７. Element type 7.<p>
	 *
	 */
	public String elm_typ7() {
		return getConstString(offset + 10, $elm_typ7);
	}

	/**
	 * 要素区分７. Element type 7.<p>
	 *
	 */
	public void elm_typ7(String value) {
		setConstString(offset + 10, $elm_typ7, value);
	}

	/**
	 * 要素区分８. Element type 8.<p>
	 *
	 */
	public String elm_typ8() {
		return getConstString(offset + 11, $elm_typ8);
	}

	/**
	 * 要素区分８. Element type 8.<p>
	 *
	 */
	public void elm_typ8(String value) {
		setConstString(offset + 11, $elm_typ8, value);
	}

	/**
	 * 要素区分９. Element type 9.<p>
	 *
	 */
	public String elm_typ9() {
		return getConstString(offset + 12, $elm_typ9);
	}

	/**
	 * 要素区分９. Element type 9.<p>
	 *
	 */
	public void elm_typ9(String value) {
		setConstString(offset + 12, $elm_typ9, value);
	}

	/**
	 * 要素区分１０. Element type 10.<p>
	 *
	 */
	public String elm_typ10() {
		return getConstString(offset + 13, $elm_typ10);
	}

	/**
	 * 要素区分１０. Element type 10.<p>
	 *
	 */
	public void elm_typ10(String value) {
		setConstString(offset + 13, $elm_typ10, value);
	}

	/**
	 * 要素１桁数. Element 1 digit.<p>
	 *
	 */
	public MCNumber elm_dgt1() {
		return getConstNumber(offset + 14, $elm_dgt1);
	}

	/**
	 * 要素１桁数. Element 1 digit.<p>
	 *
	 */
	public void elm_dgt1(MCNumber value) {
		setConstNumber(offset + 14, $elm_dgt1, value);
	}
	
	/**
	 * 要素１桁数. Element 1 digit.<p>
	 *
	 */
	public void elm_dgt1(int value) {
		setConstNumber(offset + 14, $elm_dgt1, value);
	}
	
	/**
	 * 要素１桁数. Element 1 digit.<p>
	 *
	 */
	public void elm_dgt1(long value) {
		setConstNumber(offset + 14, $elm_dgt1, value);
	}
	
	/**
	 * 要素１桁数. Element 1 digit.<p>
	 *
	 */
	public void elm_dgt1(float value) {
		setConstNumber(offset + 14, $elm_dgt1, value);
	}
	
	/**
	 * 要素１桁数. Element 1 digit.<p>
	 *
	 */
	public void elm_dgt1(double value) {
		setConstNumber(offset + 14, $elm_dgt1, value);
	}
	
	/**
	 * 要素２桁数. Element 2 digit.<p>
	 *
	 */
	public MCNumber elm_dgt2() {
		return getConstNumber(offset + 15, $elm_dgt2);
	}

	/**
	 * 要素２桁数. Element 2 digit.<p>
	 *
	 */
	public void elm_dgt2(MCNumber value) {
		setConstNumber(offset + 15, $elm_dgt2, value);
	}
	
	/**
	 * 要素２桁数. Element 2 digit.<p>
	 *
	 */
	public void elm_dgt2(int value) {
		setConstNumber(offset + 15, $elm_dgt2, value);
	}
	
	/**
	 * 要素２桁数. Element 2 digit.<p>
	 *
	 */
	public void elm_dgt2(long value) {
		setConstNumber(offset + 15, $elm_dgt2, value);
	}
	
	/**
	 * 要素２桁数. Element 2 digit.<p>
	 *
	 */
	public void elm_dgt2(float value) {
		setConstNumber(offset + 15, $elm_dgt2, value);
	}
	
	/**
	 * 要素２桁数. Element 2 digit.<p>
	 *
	 */
	public void elm_dgt2(double value) {
		setConstNumber(offset + 15, $elm_dgt2, value);
	}
	
	/**
	 * 要素３桁数. Element 3 digit.<p>
	 *
	 */
	public MCNumber elm_dgt3() {
		return getConstNumber(offset + 16, $elm_dgt3);
	}

	/**
	 * 要素３桁数. Element 3 digit.<p>
	 *
	 */
	public void elm_dgt3(MCNumber value) {
		setConstNumber(offset + 16, $elm_dgt3, value);
	}
	
	/**
	 * 要素３桁数. Element 3 digit.<p>
	 *
	 */
	public void elm_dgt3(int value) {
		setConstNumber(offset + 16, $elm_dgt3, value);
	}
	
	/**
	 * 要素３桁数. Element 3 digit.<p>
	 *
	 */
	public void elm_dgt3(long value) {
		setConstNumber(offset + 16, $elm_dgt3, value);
	}
	
	/**
	 * 要素３桁数. Element 3 digit.<p>
	 *
	 */
	public void elm_dgt3(float value) {
		setConstNumber(offset + 16, $elm_dgt3, value);
	}
	
	/**
	 * 要素３桁数. Element 3 digit.<p>
	 *
	 */
	public void elm_dgt3(double value) {
		setConstNumber(offset + 16, $elm_dgt3, value);
	}
	
	/**
	 * 要素４桁数. Element 4 digit.<p>
	 *
	 */
	public MCNumber elm_dgt4() {
		return getConstNumber(offset + 17, $elm_dgt4);
	}

	/**
	 * 要素４桁数. Element 4 digit.<p>
	 *
	 */
	public void elm_dgt4(MCNumber value) {
		setConstNumber(offset + 17, $elm_dgt4, value);
	}
	
	/**
	 * 要素４桁数. Element 4 digit.<p>
	 *
	 */
	public void elm_dgt4(int value) {
		setConstNumber(offset + 17, $elm_dgt4, value);
	}
	
	/**
	 * 要素４桁数. Element 4 digit.<p>
	 *
	 */
	public void elm_dgt4(long value) {
		setConstNumber(offset + 17, $elm_dgt4, value);
	}
	
	/**
	 * 要素４桁数. Element 4 digit.<p>
	 *
	 */
	public void elm_dgt4(float value) {
		setConstNumber(offset + 17, $elm_dgt4, value);
	}
	
	/**
	 * 要素４桁数. Element 4 digit.<p>
	 *
	 */
	public void elm_dgt4(double value) {
		setConstNumber(offset + 17, $elm_dgt4, value);
	}
	
	/**
	 * 要素５桁数. Element 5 digit.<p>
	 *
	 */
	public MCNumber elm_dgt5() {
		return getConstNumber(offset + 18, $elm_dgt5);
	}

	/**
	 * 要素５桁数. Element 5 digit.<p>
	 *
	 */
	public void elm_dgt5(MCNumber value) {
		setConstNumber(offset + 18, $elm_dgt5, value);
	}
	
	/**
	 * 要素５桁数. Element 5 digit.<p>
	 *
	 */
	public void elm_dgt5(int value) {
		setConstNumber(offset + 18, $elm_dgt5, value);
	}
	
	/**
	 * 要素５桁数. Element 5 digit.<p>
	 *
	 */
	public void elm_dgt5(long value) {
		setConstNumber(offset + 18, $elm_dgt5, value);
	}
	
	/**
	 * 要素５桁数. Element 5 digit.<p>
	 *
	 */
	public void elm_dgt5(float value) {
		setConstNumber(offset + 18, $elm_dgt5, value);
	}
	
	/**
	 * 要素５桁数. Element 5 digit.<p>
	 *
	 */
	public void elm_dgt5(double value) {
		setConstNumber(offset + 18, $elm_dgt5, value);
	}
	
	/**
	 * 要素６桁数. Element 6 digit.<p>
	 *
	 */
	public MCNumber elm_dgt6() {
		return getConstNumber(offset + 19, $elm_dgt6);
	}

	/**
	 * 要素６桁数. Element 6 digit.<p>
	 *
	 */
	public void elm_dgt6(MCNumber value) {
		setConstNumber(offset + 19, $elm_dgt6, value);
	}
	
	/**
	 * 要素６桁数. Element 6 digit.<p>
	 *
	 */
	public void elm_dgt6(int value) {
		setConstNumber(offset + 19, $elm_dgt6, value);
	}
	
	/**
	 * 要素６桁数. Element 6 digit.<p>
	 *
	 */
	public void elm_dgt6(long value) {
		setConstNumber(offset + 19, $elm_dgt6, value);
	}
	
	/**
	 * 要素６桁数. Element 6 digit.<p>
	 *
	 */
	public void elm_dgt6(float value) {
		setConstNumber(offset + 19, $elm_dgt6, value);
	}
	
	/**
	 * 要素６桁数. Element 6 digit.<p>
	 *
	 */
	public void elm_dgt6(double value) {
		setConstNumber(offset + 19, $elm_dgt6, value);
	}
	
	/**
	 * 要素７桁数. Element 7 digit.<p>
	 *
	 */
	public MCNumber elm_dgt7() {
		return getConstNumber(offset + 20, $elm_dgt7);
	}

	/**
	 * 要素７桁数. Element 7 digit.<p>
	 *
	 */
	public void elm_dgt7(MCNumber value) {
		setConstNumber(offset + 20, $elm_dgt7, value);
	}
	
	/**
	 * 要素７桁数. Element 7 digit.<p>
	 *
	 */
	public void elm_dgt7(int value) {
		setConstNumber(offset + 20, $elm_dgt7, value);
	}
	
	/**
	 * 要素７桁数. Element 7 digit.<p>
	 *
	 */
	public void elm_dgt7(long value) {
		setConstNumber(offset + 20, $elm_dgt7, value);
	}
	
	/**
	 * 要素７桁数. Element 7 digit.<p>
	 *
	 */
	public void elm_dgt7(float value) {
		setConstNumber(offset + 20, $elm_dgt7, value);
	}
	
	/**
	 * 要素７桁数. Element 7 digit.<p>
	 *
	 */
	public void elm_dgt7(double value) {
		setConstNumber(offset + 20, $elm_dgt7, value);
	}
	
	/**
	 * 要素８桁数. Element 8 digit.<p>
	 *
	 */
	public MCNumber elm_dgt8() {
		return getConstNumber(offset + 21, $elm_dgt8);
	}

	/**
	 * 要素８桁数. Element 8 digit.<p>
	 *
	 */
	public void elm_dgt8(MCNumber value) {
		setConstNumber(offset + 21, $elm_dgt8, value);
	}
	
	/**
	 * 要素８桁数. Element 8 digit.<p>
	 *
	 */
	public void elm_dgt8(int value) {
		setConstNumber(offset + 21, $elm_dgt8, value);
	}
	
	/**
	 * 要素８桁数. Element 8 digit.<p>
	 *
	 */
	public void elm_dgt8(long value) {
		setConstNumber(offset + 21, $elm_dgt8, value);
	}
	
	/**
	 * 要素８桁数. Element 8 digit.<p>
	 *
	 */
	public void elm_dgt8(float value) {
		setConstNumber(offset + 21, $elm_dgt8, value);
	}
	
	/**
	 * 要素８桁数. Element 8 digit.<p>
	 *
	 */
	public void elm_dgt8(double value) {
		setConstNumber(offset + 21, $elm_dgt8, value);
	}
	
	/**
	 * 要素９桁数. Element 9 digit.<p>
	 *
	 */
	public MCNumber elm_dgt9() {
		return getConstNumber(offset + 22, $elm_dgt9);
	}

	/**
	 * 要素９桁数. Element 9 digit.<p>
	 *
	 */
	public void elm_dgt9(MCNumber value) {
		setConstNumber(offset + 22, $elm_dgt9, value);
	}
	
	/**
	 * 要素９桁数. Element 9 digit.<p>
	 *
	 */
	public void elm_dgt9(int value) {
		setConstNumber(offset + 22, $elm_dgt9, value);
	}
	
	/**
	 * 要素９桁数. Element 9 digit.<p>
	 *
	 */
	public void elm_dgt9(long value) {
		setConstNumber(offset + 22, $elm_dgt9, value);
	}
	
	/**
	 * 要素９桁数. Element 9 digit.<p>
	 *
	 */
	public void elm_dgt9(float value) {
		setConstNumber(offset + 22, $elm_dgt9, value);
	}
	
	/**
	 * 要素９桁数. Element 9 digit.<p>
	 *
	 */
	public void elm_dgt9(double value) {
		setConstNumber(offset + 22, $elm_dgt9, value);
	}
	
	/**
	 * 要素１０桁数. Element 10 digit.<p>
	 *
	 */
	public MCNumber elm_dgt10() {
		return getConstNumber(offset + 23, $elm_dgt10);
	}

	/**
	 * 要素１０桁数. Element 10 digit.<p>
	 *
	 */
	public void elm_dgt10(MCNumber value) {
		setConstNumber(offset + 23, $elm_dgt10, value);
	}
	
	/**
	 * 要素１０桁数. Element 10 digit.<p>
	 *
	 */
	public void elm_dgt10(int value) {
		setConstNumber(offset + 23, $elm_dgt10, value);
	}
	
	/**
	 * 要素１０桁数. Element 10 digit.<p>
	 *
	 */
	public void elm_dgt10(long value) {
		setConstNumber(offset + 23, $elm_dgt10, value);
	}
	
	/**
	 * 要素１０桁数. Element 10 digit.<p>
	 *
	 */
	public void elm_dgt10(float value) {
		setConstNumber(offset + 23, $elm_dgt10, value);
	}
	
	/**
	 * 要素１０桁数. Element 10 digit.<p>
	 *
	 */
	public void elm_dgt10(double value) {
		setConstNumber(offset + 23, $elm_dgt10, value);
	}
	
	/**
	 * 固定値１. Fixed value 1.<p>
	 *
	 */
	public String fix1() {
		return getConstString(offset + 24, $fix1);
	}

	/**
	 * 固定値１. Fixed value 1.<p>
	 *
	 */
	public void fix1(String value) {
		setConstString(offset + 24, $fix1, value);
	}

	/**
	 * 固定値２. Fixed value 2.<p>
	 *
	 */
	public String fix2() {
		return getConstString(offset + 25, $fix2);
	}

	/**
	 * 固定値２. Fixed value 2.<p>
	 *
	 */
	public void fix2(String value) {
		setConstString(offset + 25, $fix2, value);
	}

	/**
	 * 固定値３. Fixed value 3.<p>
	 *
	 */
	public String fix3() {
		return getConstString(offset + 26, $fix3);
	}

	/**
	 * 固定値３. Fixed value 3.<p>
	 *
	 */
	public void fix3(String value) {
		setConstString(offset + 26, $fix3, value);
	}

	/**
	 * 固定値４. Fixed value 4.<p>
	 *
	 */
	public String fix4() {
		return getConstString(offset + 27, $fix4);
	}

	/**
	 * 固定値４. Fixed value 4.<p>
	 *
	 */
	public void fix4(String value) {
		setConstString(offset + 27, $fix4, value);
	}

	/**
	 * 固定値５. Fixed value 5.<p>
	 *
	 */
	public String fix5() {
		return getConstString(offset + 28, $fix5);
	}

	/**
	 * 固定値５. Fixed value 5.<p>
	 *
	 */
	public void fix5(String value) {
		setConstString(offset + 28, $fix5, value);
	}

	/**
	 * 固定値６. Fixed value 6.<p>
	 *
	 */
	public String fix6() {
		return getConstString(offset + 29, $fix6);
	}

	/**
	 * 固定値６. Fixed value 6.<p>
	 *
	 */
	public void fix6(String value) {
		setConstString(offset + 29, $fix6, value);
	}

	/**
	 * 固定値７. Fixed value 7.<p>
	 *
	 */
	public String fix7() {
		return getConstString(offset + 30, $fix7);
	}

	/**
	 * 固定値７. Fixed value 7.<p>
	 *
	 */
	public void fix7(String value) {
		setConstString(offset + 30, $fix7, value);
	}

	/**
	 * 固定値８. Fixed value 8.<p>
	 *
	 */
	public String fix8() {
		return getConstString(offset + 31, $fix8);
	}

	/**
	 * 固定値８. Fixed value 8.<p>
	 *
	 */
	public void fix8(String value) {
		setConstString(offset + 31, $fix8, value);
	}

	/**
	 * 固定値９. Fixed value 9.<p>
	 *
	 */
	public String fix9() {
		return getConstString(offset + 32, $fix9);
	}

	/**
	 * 固定値９. Fixed value 9.<p>
	 *
	 */
	public void fix9(String value) {
		setConstString(offset + 32, $fix9, value);
	}

	/**
	 * 固定値１０. Fixed value 10.<p>
	 *
	 */
	public String fix10() {
		return getConstString(offset + 33, $fix10);
	}

	/**
	 * 固定値１０. Fixed value 10.<p>
	 *
	 */
	public void fix10(String value) {
		setConstString(offset + 33, $fix10, value);
	}

	/**
	 * 非表示ＦＬＧ１. Hide flg. 1.<p>
	 *
	 */
	public boolean undisp_flg1() {
		return getConstBoolean(offset + 34, $undisp_flg1);
	}

	/**
	 * 非表示ＦＬＧ１. Hide flg. 1.<p>
	 *
	 */
	public void undisp_flg1(boolean value) {
		setConstBoolean(offset + 34, $undisp_flg1, value);
	}

	/**
	 * 非表示ＦＬＧ２. Hide flg. 2.<p>
	 *
	 */
	public boolean undisp_flg2() {
		return getConstBoolean(offset + 35, $undisp_flg2);
	}

	/**
	 * 非表示ＦＬＧ２. Hide flg. 2.<p>
	 *
	 */
	public void undisp_flg2(boolean value) {
		setConstBoolean(offset + 35, $undisp_flg2, value);
	}

	/**
	 * 非表示ＦＬＧ３. Hide flg. 3.<p>
	 *
	 */
	public boolean undisp_flg3() {
		return getConstBoolean(offset + 36, $undisp_flg3);
	}

	/**
	 * 非表示ＦＬＧ３. Hide flg. 3.<p>
	 *
	 */
	public void undisp_flg3(boolean value) {
		setConstBoolean(offset + 36, $undisp_flg3, value);
	}

	/**
	 * 非表示ＦＬＧ４. Hide flg. 4.<p>
	 *
	 */
	public boolean undisp_flg4() {
		return getConstBoolean(offset + 37, $undisp_flg4);
	}

	/**
	 * 非表示ＦＬＧ４. Hide flg. 4.<p>
	 *
	 */
	public void undisp_flg4(boolean value) {
		setConstBoolean(offset + 37, $undisp_flg4, value);
	}

	/**
	 * 非表示ＦＬＧ５. Hide flg. 5.<p>
	 *
	 */
	public boolean undisp_flg5() {
		return getConstBoolean(offset + 38, $undisp_flg5);
	}

	/**
	 * 非表示ＦＬＧ５. Hide flg. 5.<p>
	 *
	 */
	public void undisp_flg5(boolean value) {
		setConstBoolean(offset + 38, $undisp_flg5, value);
	}

	/**
	 * 非表示ＦＬＧ６. Hide flg. 6.<p>
	 *
	 */
	public boolean undisp_flg6() {
		return getConstBoolean(offset + 39, $undisp_flg6);
	}

	/**
	 * 非表示ＦＬＧ６. Hide flg. 6.<p>
	 *
	 */
	public void undisp_flg6(boolean value) {
		setConstBoolean(offset + 39, $undisp_flg6, value);
	}

	/**
	 * 非表示ＦＬＧ７. Hide flg. 7.<p>
	 *
	 */
	public boolean undisp_flg7() {
		return getConstBoolean(offset + 40, $undisp_flg7);
	}

	/**
	 * 非表示ＦＬＧ７. Hide flg. 7.<p>
	 *
	 */
	public void undisp_flg7(boolean value) {
		setConstBoolean(offset + 40, $undisp_flg7, value);
	}

	/**
	 * 非表示ＦＬＧ８. Hide flg. 8.<p>
	 *
	 */
	public boolean undisp_flg8() {
		return getConstBoolean(offset + 41, $undisp_flg8);
	}

	/**
	 * 非表示ＦＬＧ８. Hide flg. 8.<p>
	 *
	 */
	public void undisp_flg8(boolean value) {
		setConstBoolean(offset + 41, $undisp_flg8, value);
	}

	/**
	 * 非表示ＦＬＧ９. Hide flg. 9.<p>
	 *
	 */
	public boolean undisp_flg9() {
		return getConstBoolean(offset + 42, $undisp_flg9);
	}

	/**
	 * 非表示ＦＬＧ９. Hide flg. 9.<p>
	 *
	 */
	public void undisp_flg9(boolean value) {
		setConstBoolean(offset + 42, $undisp_flg9, value);
	}

	/**
	 * 非表示ＦＬＧ１０. Hide flg. 10.<p>
	 *
	 */
	public boolean undisp_flg10() {
		return getConstBoolean(offset + 43, $undisp_flg10);
	}

	/**
	 * 非表示ＦＬＧ１０. Hide flg. 10.<p>
	 *
	 */
	public void undisp_flg10(boolean value) {
		setConstBoolean(offset + 43, $undisp_flg10, value);
	}

	/**
	 * 桁埋め文字１. Digit fill character 1.<p>
	 *
	 */
	public String num_pad_str1() {
		return getConstString(offset + 44, $num_pad_str1);
	}

	/**
	 * 桁埋め文字１. Digit fill character 1.<p>
	 *
	 */
	public void num_pad_str1(String value) {
		setConstString(offset + 44, $num_pad_str1, value);
	}

	/**
	 * 桁埋め文字２. Digit fill character 2.<p>
	 *
	 */
	public String num_pad_str2() {
		return getConstString(offset + 45, $num_pad_str2);
	}

	/**
	 * 桁埋め文字２. Digit fill character 2.<p>
	 *
	 */
	public void num_pad_str2(String value) {
		setConstString(offset + 45, $num_pad_str2, value);
	}

	/**
	 * 桁埋め文字３. Digit fill character 3.<p>
	 *
	 */
	public String num_pad_str3() {
		return getConstString(offset + 46, $num_pad_str3);
	}

	/**
	 * 桁埋め文字３. Digit fill character 3.<p>
	 *
	 */
	public void num_pad_str3(String value) {
		setConstString(offset + 46, $num_pad_str3, value);
	}

	/**
	 * 桁埋め文字４. Digit fill character 4.<p>
	 *
	 */
	public String num_pad_str4() {
		return getConstString(offset + 47, $num_pad_str4);
	}

	/**
	 * 桁埋め文字４. Digit fill character 4.<p>
	 *
	 */
	public void num_pad_str4(String value) {
		setConstString(offset + 47, $num_pad_str4, value);
	}

	/**
	 * 桁埋め文字５. Digit fill character 5.<p>
	 *
	 */
	public String num_pad_str5() {
		return getConstString(offset + 48, $num_pad_str5);
	}

	/**
	 * 桁埋め文字５. Digit fill character 5.<p>
	 *
	 */
	public void num_pad_str5(String value) {
		setConstString(offset + 48, $num_pad_str5, value);
	}

	/**
	 * 桁埋め文字６. Digit fill character 6.<p>
	 *
	 */
	public String num_pad_str6() {
		return getConstString(offset + 49, $num_pad_str6);
	}

	/**
	 * 桁埋め文字６. Digit fill character 6.<p>
	 *
	 */
	public void num_pad_str6(String value) {
		setConstString(offset + 49, $num_pad_str6, value);
	}

	/**
	 * 桁埋め文字７. Digit fill character 7.<p>
	 *
	 */
	public String num_pad_str7() {
		return getConstString(offset + 50, $num_pad_str7);
	}

	/**
	 * 桁埋め文字７. Digit fill character 7.<p>
	 *
	 */
	public void num_pad_str7(String value) {
		setConstString(offset + 50, $num_pad_str7, value);
	}

	/**
	 * 桁埋め文字８. Digit fill character 8.<p>
	 *
	 */
	public String num_pad_str8() {
		return getConstString(offset + 51, $num_pad_str8);
	}

	/**
	 * 桁埋め文字８. Digit fill character 8.<p>
	 *
	 */
	public void num_pad_str8(String value) {
		setConstString(offset + 51, $num_pad_str8, value);
	}

	/**
	 * 桁埋め文字９. Digit fill character 9.<p>
	 *
	 */
	public String num_pad_str9() {
		return getConstString(offset + 52, $num_pad_str9);
	}

	/**
	 * 桁埋め文字９. Digit fill character 9.<p>
	 *
	 */
	public void num_pad_str9(String value) {
		setConstString(offset + 52, $num_pad_str9, value);
	}

	/**
	 * 桁埋め文字１０. Digit fill character 10.<p>
	 *
	 */
	public String num_pad_str10() {
		return getConstString(offset + 53, $num_pad_str10);
	}

	/**
	 * 桁埋め文字１０. Digit fill character 10.<p>
	 *
	 */
	public void num_pad_str10(String value) {
		setConstString(offset + 53, $num_pad_str10, value);
	}

	/**
	 * キー項目桁数. Key column number.<p>
	 *
	 */
	public MCNumber key_dgt() {
		return getConstNumber(offset + 54, $key_dgt);
	}

	/**
	 * キー項目桁数. Key column number.<p>
	 *
	 */
	public void key_dgt(MCNumber value) {
		setConstNumber(offset + 54, $key_dgt, value);
	}
	
	/**
	 * キー項目桁数. Key column number.<p>
	 *
	 */
	public void key_dgt(int value) {
		setConstNumber(offset + 54, $key_dgt, value);
	}
	
	/**
	 * キー項目桁数. Key column number.<p>
	 *
	 */
	public void key_dgt(long value) {
		setConstNumber(offset + 54, $key_dgt, value);
	}
	
	/**
	 * キー項目桁数. Key column number.<p>
	 *
	 */
	public void key_dgt(float value) {
		setConstNumber(offset + 54, $key_dgt, value);
	}
	
	/**
	 * キー項目桁数. Key column number.<p>
	 *
	 */
	public void key_dgt(double value) {
		setConstNumber(offset + 54, $key_dgt, value);
	}
	
	/**
	 * シーケンス区分. Sequence type.<p>
	 *
	 */
	public String def_seq_typ() {
		return getConstString(offset + 55, $def_seq_typ);
	}

	/**
	 * シーケンス区分. Sequence type.<p>
	 *
	 */
	public void def_seq_typ(String value) {
		setConstString(offset + 55, $def_seq_typ, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 56, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 56, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 57, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 57, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 58, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 58, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 59, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 59, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 60, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 60, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 61, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 61, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 62, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 62, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 63, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 63, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 64, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 64, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 65, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 65, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 66, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 66, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 67, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 68, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 68, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 69, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 69, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 70, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 70, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 71, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 71, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 72, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 72, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		if ($base_num_ptn_nm.equalsIgnoreCase(name)) {
			return base_num_ptn_nm();
		}
		if ($elm_typ1.equalsIgnoreCase(name)) {
			return elm_typ1();
		}
		if ($elm_typ2.equalsIgnoreCase(name)) {
			return elm_typ2();
		}
		if ($elm_typ3.equalsIgnoreCase(name)) {
			return elm_typ3();
		}
		if ($elm_typ4.equalsIgnoreCase(name)) {
			return elm_typ4();
		}
		if ($elm_typ5.equalsIgnoreCase(name)) {
			return elm_typ5();
		}
		if ($elm_typ6.equalsIgnoreCase(name)) {
			return elm_typ6();
		}
		if ($elm_typ7.equalsIgnoreCase(name)) {
			return elm_typ7();
		}
		if ($elm_typ8.equalsIgnoreCase(name)) {
			return elm_typ8();
		}
		if ($elm_typ9.equalsIgnoreCase(name)) {
			return elm_typ9();
		}
		if ($elm_typ10.equalsIgnoreCase(name)) {
			return elm_typ10();
		}
		if ($fix1.equalsIgnoreCase(name)) {
			return fix1();
		}
		if ($fix2.equalsIgnoreCase(name)) {
			return fix2();
		}
		if ($fix3.equalsIgnoreCase(name)) {
			return fix3();
		}
		if ($fix4.equalsIgnoreCase(name)) {
			return fix4();
		}
		if ($fix5.equalsIgnoreCase(name)) {
			return fix5();
		}
		if ($fix6.equalsIgnoreCase(name)) {
			return fix6();
		}
		if ($fix7.equalsIgnoreCase(name)) {
			return fix7();
		}
		if ($fix8.equalsIgnoreCase(name)) {
			return fix8();
		}
		if ($fix9.equalsIgnoreCase(name)) {
			return fix9();
		}
		if ($fix10.equalsIgnoreCase(name)) {
			return fix10();
		}
		if ($num_pad_str1.equalsIgnoreCase(name)) {
			return num_pad_str1();
		}
		if ($num_pad_str2.equalsIgnoreCase(name)) {
			return num_pad_str2();
		}
		if ($num_pad_str3.equalsIgnoreCase(name)) {
			return num_pad_str3();
		}
		if ($num_pad_str4.equalsIgnoreCase(name)) {
			return num_pad_str4();
		}
		if ($num_pad_str5.equalsIgnoreCase(name)) {
			return num_pad_str5();
		}
		if ($num_pad_str6.equalsIgnoreCase(name)) {
			return num_pad_str6();
		}
		if ($num_pad_str7.equalsIgnoreCase(name)) {
			return num_pad_str7();
		}
		if ($num_pad_str8.equalsIgnoreCase(name)) {
			return num_pad_str8();
		}
		if ($num_pad_str9.equalsIgnoreCase(name)) {
			return num_pad_str9();
		}
		if ($num_pad_str10.equalsIgnoreCase(name)) {
			return num_pad_str10();
		}
		if ($def_seq_typ.equalsIgnoreCase(name)) {
			return def_seq_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			return elm_dgt1();
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			return elm_dgt2();
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			return elm_dgt3();
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			return elm_dgt4();
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			return elm_dgt5();
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			return elm_dgt6();
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			return elm_dgt7();
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			return elm_dgt8();
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			return elm_dgt9();
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			return elm_dgt10();
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			return key_dgt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($undisp_flg1.equalsIgnoreCase(name)) {
			return undisp_flg1();
		}
		if ($undisp_flg2.equalsIgnoreCase(name)) {
			return undisp_flg2();
		}
		if ($undisp_flg3.equalsIgnoreCase(name)) {
			return undisp_flg3();
		}
		if ($undisp_flg4.equalsIgnoreCase(name)) {
			return undisp_flg4();
		}
		if ($undisp_flg5.equalsIgnoreCase(name)) {
			return undisp_flg5();
		}
		if ($undisp_flg6.equalsIgnoreCase(name)) {
			return undisp_flg6();
		}
		if ($undisp_flg7.equalsIgnoreCase(name)) {
			return undisp_flg7();
		}
		if ($undisp_flg8.equalsIgnoreCase(name)) {
			return undisp_flg8();
		}
		if ($undisp_flg9.equalsIgnoreCase(name)) {
			return undisp_flg9();
		}
		if ($undisp_flg10.equalsIgnoreCase(name)) {
			return undisp_flg10();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		if ($base_num_ptn_nm.equalsIgnoreCase(name)) {
			return base_num_ptn_nm();
		}
		if ($elm_typ1.equalsIgnoreCase(name)) {
			return elm_typ1();
		}
		if ($elm_typ2.equalsIgnoreCase(name)) {
			return elm_typ2();
		}
		if ($elm_typ3.equalsIgnoreCase(name)) {
			return elm_typ3();
		}
		if ($elm_typ4.equalsIgnoreCase(name)) {
			return elm_typ4();
		}
		if ($elm_typ5.equalsIgnoreCase(name)) {
			return elm_typ5();
		}
		if ($elm_typ6.equalsIgnoreCase(name)) {
			return elm_typ6();
		}
		if ($elm_typ7.equalsIgnoreCase(name)) {
			return elm_typ7();
		}
		if ($elm_typ8.equalsIgnoreCase(name)) {
			return elm_typ8();
		}
		if ($elm_typ9.equalsIgnoreCase(name)) {
			return elm_typ9();
		}
		if ($elm_typ10.equalsIgnoreCase(name)) {
			return elm_typ10();
		}
		if ($fix1.equalsIgnoreCase(name)) {
			return fix1();
		}
		if ($fix2.equalsIgnoreCase(name)) {
			return fix2();
		}
		if ($fix3.equalsIgnoreCase(name)) {
			return fix3();
		}
		if ($fix4.equalsIgnoreCase(name)) {
			return fix4();
		}
		if ($fix5.equalsIgnoreCase(name)) {
			return fix5();
		}
		if ($fix6.equalsIgnoreCase(name)) {
			return fix6();
		}
		if ($fix7.equalsIgnoreCase(name)) {
			return fix7();
		}
		if ($fix8.equalsIgnoreCase(name)) {
			return fix8();
		}
		if ($fix9.equalsIgnoreCase(name)) {
			return fix9();
		}
		if ($fix10.equalsIgnoreCase(name)) {
			return fix10();
		}
		if ($num_pad_str1.equalsIgnoreCase(name)) {
			return num_pad_str1();
		}
		if ($num_pad_str2.equalsIgnoreCase(name)) {
			return num_pad_str2();
		}
		if ($num_pad_str3.equalsIgnoreCase(name)) {
			return num_pad_str3();
		}
		if ($num_pad_str4.equalsIgnoreCase(name)) {
			return num_pad_str4();
		}
		if ($num_pad_str5.equalsIgnoreCase(name)) {
			return num_pad_str5();
		}
		if ($num_pad_str6.equalsIgnoreCase(name)) {
			return num_pad_str6();
		}
		if ($num_pad_str7.equalsIgnoreCase(name)) {
			return num_pad_str7();
		}
		if ($num_pad_str8.equalsIgnoreCase(name)) {
			return num_pad_str8();
		}
		if ($num_pad_str9.equalsIgnoreCase(name)) {
			return num_pad_str9();
		}
		if ($num_pad_str10.equalsIgnoreCase(name)) {
			return num_pad_str10();
		}
		if ($def_seq_typ.equalsIgnoreCase(name)) {
			return def_seq_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			return elm_dgt1();
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			return elm_dgt2();
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			return elm_dgt3();
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			return elm_dgt4();
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			return elm_dgt5();
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			return elm_dgt6();
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			return elm_dgt7();
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			return elm_dgt8();
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			return elm_dgt9();
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			return elm_dgt10();
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			return key_dgt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($undisp_flg1.equalsIgnoreCase(name)) {
			return undisp_flg1();
		}
		if ($undisp_flg2.equalsIgnoreCase(name)) {
			return undisp_flg2();
		}
		if ($undisp_flg3.equalsIgnoreCase(name)) {
			return undisp_flg3();
		}
		if ($undisp_flg4.equalsIgnoreCase(name)) {
			return undisp_flg4();
		}
		if ($undisp_flg5.equalsIgnoreCase(name)) {
			return undisp_flg5();
		}
		if ($undisp_flg6.equalsIgnoreCase(name)) {
			return undisp_flg6();
		}
		if ($undisp_flg7.equalsIgnoreCase(name)) {
			return undisp_flg7();
		}
		if ($undisp_flg8.equalsIgnoreCase(name)) {
			return undisp_flg8();
		}
		if ($undisp_flg9.equalsIgnoreCase(name)) {
			return undisp_flg9();
		}
		if ($undisp_flg10.equalsIgnoreCase(name)) {
			return undisp_flg10();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		if ($base_num_ptn_nm.equalsIgnoreCase(name)) {
			base_num_ptn_nm(value);
			return;
		}
		if ($elm_typ1.equalsIgnoreCase(name)) {
			elm_typ1(value);
			return;
		}
		if ($elm_typ2.equalsIgnoreCase(name)) {
			elm_typ2(value);
			return;
		}
		if ($elm_typ3.equalsIgnoreCase(name)) {
			elm_typ3(value);
			return;
		}
		if ($elm_typ4.equalsIgnoreCase(name)) {
			elm_typ4(value);
			return;
		}
		if ($elm_typ5.equalsIgnoreCase(name)) {
			elm_typ5(value);
			return;
		}
		if ($elm_typ6.equalsIgnoreCase(name)) {
			elm_typ6(value);
			return;
		}
		if ($elm_typ7.equalsIgnoreCase(name)) {
			elm_typ7(value);
			return;
		}
		if ($elm_typ8.equalsIgnoreCase(name)) {
			elm_typ8(value);
			return;
		}
		if ($elm_typ9.equalsIgnoreCase(name)) {
			elm_typ9(value);
			return;
		}
		if ($elm_typ10.equalsIgnoreCase(name)) {
			elm_typ10(value);
			return;
		}
		if ($fix1.equalsIgnoreCase(name)) {
			fix1(value);
			return;
		}
		if ($fix2.equalsIgnoreCase(name)) {
			fix2(value);
			return;
		}
		if ($fix3.equalsIgnoreCase(name)) {
			fix3(value);
			return;
		}
		if ($fix4.equalsIgnoreCase(name)) {
			fix4(value);
			return;
		}
		if ($fix5.equalsIgnoreCase(name)) {
			fix5(value);
			return;
		}
		if ($fix6.equalsIgnoreCase(name)) {
			fix6(value);
			return;
		}
		if ($fix7.equalsIgnoreCase(name)) {
			fix7(value);
			return;
		}
		if ($fix8.equalsIgnoreCase(name)) {
			fix8(value);
			return;
		}
		if ($fix9.equalsIgnoreCase(name)) {
			fix9(value);
			return;
		}
		if ($fix10.equalsIgnoreCase(name)) {
			fix10(value);
			return;
		}
		if ($num_pad_str1.equalsIgnoreCase(name)) {
			num_pad_str1(value);
			return;
		}
		if ($num_pad_str2.equalsIgnoreCase(name)) {
			num_pad_str2(value);
			return;
		}
		if ($num_pad_str3.equalsIgnoreCase(name)) {
			num_pad_str3(value);
			return;
		}
		if ($num_pad_str4.equalsIgnoreCase(name)) {
			num_pad_str4(value);
			return;
		}
		if ($num_pad_str5.equalsIgnoreCase(name)) {
			num_pad_str5(value);
			return;
		}
		if ($num_pad_str6.equalsIgnoreCase(name)) {
			num_pad_str6(value);
			return;
		}
		if ($num_pad_str7.equalsIgnoreCase(name)) {
			num_pad_str7(value);
			return;
		}
		if ($num_pad_str8.equalsIgnoreCase(name)) {
			num_pad_str8(value);
			return;
		}
		if ($num_pad_str9.equalsIgnoreCase(name)) {
			num_pad_str9(value);
			return;
		}
		if ($num_pad_str10.equalsIgnoreCase(name)) {
			num_pad_str10(value);
			return;
		}
		if ($def_seq_typ.equalsIgnoreCase(name)) {
			def_seq_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($undisp_flg1.equalsIgnoreCase(name)) {
			undisp_flg1(value);
			return;
		}
		if ($undisp_flg2.equalsIgnoreCase(name)) {
			undisp_flg2(value);
			return;
		}
		if ($undisp_flg3.equalsIgnoreCase(name)) {
			undisp_flg3(value);
			return;
		}
		if ($undisp_flg4.equalsIgnoreCase(name)) {
			undisp_flg4(value);
			return;
		}
		if ($undisp_flg5.equalsIgnoreCase(name)) {
			undisp_flg5(value);
			return;
		}
		if ($undisp_flg6.equalsIgnoreCase(name)) {
			undisp_flg6(value);
			return;
		}
		if ($undisp_flg7.equalsIgnoreCase(name)) {
			undisp_flg7(value);
			return;
		}
		if ($undisp_flg8.equalsIgnoreCase(name)) {
			undisp_flg8(value);
			return;
		}
		if ($undisp_flg9.equalsIgnoreCase(name)) {
			undisp_flg9(value);
			return;
		}
		if ($undisp_flg10.equalsIgnoreCase(name)) {
			undisp_flg10(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		if ($base_num_ptn_nm.equalsIgnoreCase(name)) {
			base_num_ptn_nm(value);
			return;
		}
		if ($elm_typ1.equalsIgnoreCase(name)) {
			elm_typ1(value);
			return;
		}
		if ($elm_typ2.equalsIgnoreCase(name)) {
			elm_typ2(value);
			return;
		}
		if ($elm_typ3.equalsIgnoreCase(name)) {
			elm_typ3(value);
			return;
		}
		if ($elm_typ4.equalsIgnoreCase(name)) {
			elm_typ4(value);
			return;
		}
		if ($elm_typ5.equalsIgnoreCase(name)) {
			elm_typ5(value);
			return;
		}
		if ($elm_typ6.equalsIgnoreCase(name)) {
			elm_typ6(value);
			return;
		}
		if ($elm_typ7.equalsIgnoreCase(name)) {
			elm_typ7(value);
			return;
		}
		if ($elm_typ8.equalsIgnoreCase(name)) {
			elm_typ8(value);
			return;
		}
		if ($elm_typ9.equalsIgnoreCase(name)) {
			elm_typ9(value);
			return;
		}
		if ($elm_typ10.equalsIgnoreCase(name)) {
			elm_typ10(value);
			return;
		}
		if ($fix1.equalsIgnoreCase(name)) {
			fix1(value);
			return;
		}
		if ($fix2.equalsIgnoreCase(name)) {
			fix2(value);
			return;
		}
		if ($fix3.equalsIgnoreCase(name)) {
			fix3(value);
			return;
		}
		if ($fix4.equalsIgnoreCase(name)) {
			fix4(value);
			return;
		}
		if ($fix5.equalsIgnoreCase(name)) {
			fix5(value);
			return;
		}
		if ($fix6.equalsIgnoreCase(name)) {
			fix6(value);
			return;
		}
		if ($fix7.equalsIgnoreCase(name)) {
			fix7(value);
			return;
		}
		if ($fix8.equalsIgnoreCase(name)) {
			fix8(value);
			return;
		}
		if ($fix9.equalsIgnoreCase(name)) {
			fix9(value);
			return;
		}
		if ($fix10.equalsIgnoreCase(name)) {
			fix10(value);
			return;
		}
		if ($num_pad_str1.equalsIgnoreCase(name)) {
			num_pad_str1(value);
			return;
		}
		if ($num_pad_str2.equalsIgnoreCase(name)) {
			num_pad_str2(value);
			return;
		}
		if ($num_pad_str3.equalsIgnoreCase(name)) {
			num_pad_str3(value);
			return;
		}
		if ($num_pad_str4.equalsIgnoreCase(name)) {
			num_pad_str4(value);
			return;
		}
		if ($num_pad_str5.equalsIgnoreCase(name)) {
			num_pad_str5(value);
			return;
		}
		if ($num_pad_str6.equalsIgnoreCase(name)) {
			num_pad_str6(value);
			return;
		}
		if ($num_pad_str7.equalsIgnoreCase(name)) {
			num_pad_str7(value);
			return;
		}
		if ($num_pad_str8.equalsIgnoreCase(name)) {
			num_pad_str8(value);
			return;
		}
		if ($num_pad_str9.equalsIgnoreCase(name)) {
			num_pad_str9(value);
			return;
		}
		if ($num_pad_str10.equalsIgnoreCase(name)) {
			num_pad_str10(value);
			return;
		}
		if ($def_seq_typ.equalsIgnoreCase(name)) {
			def_seq_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($undisp_flg1.equalsIgnoreCase(name)) {
			undisp_flg1(value);
			return;
		}
		if ($undisp_flg2.equalsIgnoreCase(name)) {
			undisp_flg2(value);
			return;
		}
		if ($undisp_flg3.equalsIgnoreCase(name)) {
			undisp_flg3(value);
			return;
		}
		if ($undisp_flg4.equalsIgnoreCase(name)) {
			undisp_flg4(value);
			return;
		}
		if ($undisp_flg5.equalsIgnoreCase(name)) {
			undisp_flg5(value);
			return;
		}
		if ($undisp_flg6.equalsIgnoreCase(name)) {
			undisp_flg6(value);
			return;
		}
		if ($undisp_flg7.equalsIgnoreCase(name)) {
			undisp_flg7(value);
			return;
		}
		if ($undisp_flg8.equalsIgnoreCase(name)) {
			undisp_flg8(value);
			return;
		}
		if ($undisp_flg9.equalsIgnoreCase(name)) {
			undisp_flg9(value);
			return;
		}
		if ($undisp_flg10.equalsIgnoreCase(name)) {
			undisp_flg10(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
