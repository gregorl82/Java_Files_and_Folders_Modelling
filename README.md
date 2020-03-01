<h1>Java Files and Folders Modelling</h1>
<h2>Objectives</h2>
<ul>
<li>Understand the relationships, one to many and many to many</li>
<li>Be able to create the RESTful routes for a set of resources</li>
<li>Use Insomnia to GET and POST records</li>
</ul>
<h2>Brief</h2>
<p>Create a one-to-many Spring application using annotations.</p>
<p>The application should have the following models: Folders, Files and Users. Users should have many folders, and folders should have many files.</p>
<p>Create repositories for each entity.</p>
<p>Create controllers for each entity, too, and ensure they implement the index, create and show routes.</p>
<h2>MVP</h2>
<p>Create a system to track files and folders:</p>
<p>A File should have:</p>
<ul>
<li>a name</li>
<li>extension (e.g. txt, rb, java, ppt)</li>
<li>size</li>
<li>folder</li>
</ul>
<p>A User should have:</p>
<ul>
<li>name</li>
<li>a list of folders</li>
</ul>
<p>A Folder should have:</p>
<ul>
<li>a title</li>
<li>list of files</li>
<li>a user</li>
</ul>
<p>Create a seeding file DataLoader component to pre-seed the database.
<p>Use Insomnia to test each of the RESTful routes.</p>
